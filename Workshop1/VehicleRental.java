/*Vehicle Rental Application Scenario:
Build a system for renting bikes, cars, and trucks to customers.

Concepts Used:
● Class: Vehicle, Bike, Car, Truck, Customer (Scenario-based problems)
● Constructors: Custom constructors for different vehicle types
● Access Modifiers: protected for vehicle attributes to allow subclass access
● Interface: Rentable with method calculateRent(int days)
● Operators: Used in rent calculation (e.g., baseRate × days ± surcharges)

OOP Concepts:
○ Abstraction: Rentable abstracts rental behavior
○ Inheritance: Car, Bike, Truck inherit from Vehicle
○ Polymorphism: Rent calculation differs by vehicle type
○ Encapsulation: All fields hidden behind getters/setters
*/

package review;
import java.util.*;

interface Rentable{
	double calculateRent(int days);
}


abstract class Vehicle implements Rentable{
	protected String brand;
	protected String model;
	protected double baseRate;
	protected double rent;
	
	public Vehicle(String brand,String model,double baseRate){
		this.brand=brand;
		this.model=model;
		this.baseRate=baseRate;
		
	}
	public String getbrand(){
		return brand;
	}
	public String getmodel() {
		return model;
	}
	public double baseRate(){
		return baseRate;
	}
	
	public abstract void displayInfo();
}

class Bike extends Vehicle{
	public Bike(String brand,String model,double price) {
		super(brand,model,price);
	}
	
	@Override
	public double calculateRent(int days) {
		int surcharges=200; 
		return (baseRate*days) +surcharges;
	}
	
	public void displayInfo() {
		System.out.println("<------Bike Details----->");
		System.out.println("Brand Name: " +brand);
		System.out.println("Model Name:  " +model);
	}
	
	
}

class Car extends Vehicle{
	
	public Car(String brand,String model,double price) {
		super(brand,model,price);
	}
	
	@Override
	public double calculateRent(int days) {
		int surcharges=500; 
		return (baseRate*days) +surcharges;
	}
	
	public void displayInfo() {
		System.out.println("<------Car Details----->");
		System.out.println("Brand Name: " +brand);
		System.out.println("Model Name:  " +model);
	}
	
}

class Truck extends Vehicle{
	
	public Truck(String brand,String model,double price) {
		super(brand,model,price);
	}
	
	@Override
	public double calculateRent(int days) {
		int surcharges=900; 
		return (baseRate*days) +surcharges;
	}
	
	public void displayInfo() {
		System.out.println("<------Truck Details----->");
		System.out.println("Brand Name: " +brand);
		System.out.println("Model Name:  " +model);
	}
}


class Customer{
	protected String customerName;
	protected String phoneNumber;
	
	public Customer(String customerName,String phoneNumber) {
		this.customerName=customerName;
		this.phoneNumber=phoneNumber;
	}
	
	public String getcustomerName() {
		return customerName;
	}
	
	public String getphoneNumber() {
		return  phoneNumber;
	}
	

    public void displayCustomer() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Phone number: " +phoneNumber);
    }
	
}

public class VehicleRental {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Customer Name: ");
		String name=sc.next();
		
		System.out.println("Enter 10 digit phone Numer: ");
		String phoneNumber=sc.next();
		Customer customer=new Customer(name,phoneNumber);
		
		customer.displayCustomer();
		
		 System.out.println("\nChoose a vehicle to rent:");
	        System.out.println("1. Bike");
	        System.out.println("2. Car");
	        System.out.println("3. Truck");

	        int choice = sc.nextInt();
	        Vehicle vehicle = null;

	        switch (choice) {
	            case 1:
	                vehicle = new Bike("BIK123", "Hero Splendor", 200);
	                break;
	            case 2:
	                vehicle = new Car("CAR456", "Maruti Swift", 800);
	                break;
	            case 3:
	                vehicle = new Truck("TRK789", "Tata LPT", 1500);
	                break;
	            default:
	                System.out.println("Invalid choice!");
	                System.exit(0);
	        }

	        // Take rental duration
	        System.out.print("Enter number of rental days: ");
	        int days = sc.nextInt();

	        // Display Info
	        System.out.println("\nRental Details:");
	     
	        vehicle.displayInfo();

	        double rent = vehicle.calculateRent(days);
	        System.out.println("Total Rent for " + days + " days: " +rent);
		
	}
	
	

}
