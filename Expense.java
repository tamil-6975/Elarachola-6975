package advancedjava;


	public class Expense {
	    private String category;
	    private double amount;
	    private String description;

	    public Expense(String category, double amount, String description) {
	        this.category = category;
	        this.amount = amount;
	        this.description = description;
	    }

	    public String toCSV() {
	        return category + "," + amount + "," + description;
	    }

	    @Override
	    public String toString() {
	        return category + " | ₹" + amount + " | " + description;
	    }
	}


