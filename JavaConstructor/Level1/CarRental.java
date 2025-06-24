package level1;

public class CarRental {
  
	
    String customerName;
    String carModel;
    int rentalDays;

   
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }


    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }


    public double calculateTotalCost() {
        double ratePerDay;

       
        switch (carModel.toLowerCase()) {
            case "suv":
                ratePerDay = 1000.0;
                break;
            case "sedan":
                ratePerDay = 800.0;
                break;
            case "hatchback":
                ratePerDay = 500.0;
                break;
            default:
                ratePerDay = 600.0; 
        }

        return ratePerDay * rentalDays;
    }


    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

  
    public static void main(String[] args) {
       
        CarRental rental1 = new CarRental();
        System.out.println("Default Rental:");
        rental1.displayRentalDetails();

        System.out.println();
        CarRental rental2 = new CarRental("Khushi Goyal", "SUV", 4);
        System.out.println("Custom Rental:");
        rental2.displayRentalDetails();
    }
}
