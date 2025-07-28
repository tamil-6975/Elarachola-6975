package advancedjava;

	import java.io.*;
	import java.util.*;

	public class ExpenseManager {
	    private List<Expense> expenses = new ArrayList<>();
	    private final String FILE_NAME = "expenses.csv";

	    public void addExpense(Expense e) {
	        expenses.add(e);
	    }

	    public void listExpenses() {
	        for (Expense e : expenses)
	            System.out.println(e);
	    }

	    public void saveExpenses() {
	        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
	            for (Expense e : expenses)
	                pw.println(e.toCSV());
	        } catch (IOException ex) {
	            System.out.println("Error saving expenses.");
	        }
	    }

	    public void loadExpenses() {
	        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] parts = line.split(",");
	                expenses.add(new Expense(parts[0], Double.parseDouble(parts[1]), parts[2]));
	            }
	        } catch (IOException ex) {
	            System.out.println("No previous expenses found.");
	        }
	    }
	}



