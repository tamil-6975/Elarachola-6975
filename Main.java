package advancedjava;


	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        ExpenseManager manager = new ExpenseManager();
	        Scanner sc = new Scanner(System.in);
	        manager.loadExpenses();

	        while (true) {
	            System.out.print("\n1. Add Expense\n2. View Expenses\n3. Save and Exit\nChoose: ");
	            int choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1 -> {
	                    System.out.print("Category: ");
	                    String cat = sc.nextLine();
	                    System.out.print("Amount (₹): ");
	                    double amt = sc.nextDouble();
	                    sc.nextLine(); // consume newline
	                    System.out.print("Description: ");
	                    String desc = sc.nextLine();
	                    manager.addExpense(new Expense(cat, amt, desc));
	                }
	                case 2 -> manager.listExpenses();
	                case 3 -> {
	                    manager.saveExpenses();
	                    System.out.println("Saved. Goodbye!");
	                    return;
	                }
	                default -> System.out.println("Invalid choice.");
	            }
	        }
	    }
	}



