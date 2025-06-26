package level1;

public class Vehicle {
	
	  static double registrationFee = 5000.0;
	  final String registrationNumber;
	  
	  String ownerName;
	  String vehicleType;
	  
	  Vehicle(String ownerName,String vehicleType,String registrationNumber){
		  this.ownerName=ownerName;
		  this.vehicleType=vehicleType;
		  this.registrationNumber=registrationNumber;
	  }
	  
	  static void updateRegistrationFee(double newFee) {
	        registrationFee = newFee;
	        System.out.println("Registration fee updated to: ₹" + registrationFee);
	    }

	  void displayRegistrationDetails() {
	        System.out.println("Owner Name: " + ownerName);
	        System.out.println("Vehicle Type: " + vehicleType);
	        System.out.println("Registration Number: " + registrationNumber);
	        System.out.println("Registration Fee: ₹" + registrationFee);
	    }
	  
	  public static void main(String[] args) {
		  Vehicle v1 = new Vehicle("Rahul Sharma", "Car", "DL01AB1234");
	      Vehicle v2 = new Vehicle("Priya Verma", "Bike", "DL02XY5678");

	        
	        if (v1 instanceof Vehicle) {
	            System.out.println("\nVehicle 1 Details:");
	            v1.displayRegistrationDetails();
	        }

	        if (v2 instanceof Vehicle) {
	            System.out.println("\nVehicle 2 Details:");
	            v2.displayRegistrationDetails();
	        }
	        
	        Vehicle.updateRegistrationFee(6000.0);

	        // Displaying details again to see updated fee
	        System.out.println("\nAfter Updating Registration Fee:");

	        if (v1 instanceof Vehicle) {
	            v1.displayRegistrationDetails();
	        }

	        if (v2 instanceof Vehicle) {
	            v2.displayRegistrationDetails();
	        }
	  }
	  

}
