package constructor;
class Student {
    // Default constructor
    public Student() {
        System.out.println("Student object is created");
    }
}
public class Commission {
	// Commission class
	 // Data members
	    private String name;
	    private String address;
	    private String phone;
	    private double salesAmount;

	    // Constructor
	    public Commission(String name, String address, String phone, double salesAmount) {
	        this.name = name;
	        this.address = address;
	        this.phone = phone;
	        this.salesAmount = salesAmount;
	    }

	    // Method to accept details
	    public void acceptDetails(String name, String address, String phone, double salesAmount) {
	        this.name = name;
	        this.address = address;
	        this.phone = phone;
	        this.salesAmount = salesAmount;
	    }

	    // Method to calculate commission
	    public double calculateCommission() {
	        double commission = 0.0;

	        if (salesAmount >= 100000) {
	            commission = salesAmount * 0.10; // 10% commission
	        } else if (salesAmount >= 50000) {
	            commission = salesAmount * 0.05; // 5% commission
	        } else if (salesAmount >= 30000) {
	            commission = salesAmount * 0.03; // 3% commission
	        } else {
	            commission = 0.0; // No commission
	        }

	        return commission;
	    }
	}

	// Main class
	public class Main {
	    public static void main(String[] args) {
	        // Create a Student object (default constructor will run)
	        Student student = new Student();

	        // Create a Commission object and call member methods
	        Commission salesPerson = new Commission("John Doe", "123 Main St", "555-1234", 75000.0);
	        
	        // Accept details (optional, since already initialized in constructor)
	        // salesPerson.acceptDetails("John Doe", "123 Main St", "555-1234", 75000.0);

	        // Calculate commission
	        double commission = salesPerson.calculateCommission();
	        System.out.println("Commission for " + salesPerson.getName() + ": $" + commission);
	    }
	}
}
