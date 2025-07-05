package workshop;

import java.util.*;

abstract class Vehicle {
	protected	String brand;
	protected String model;
	protected String fuelType;
	
	public Vehicle(String brand,String model,String fuelType) {
		this.brand=brand;
		this.model=model;
		this.fuelType=fuelType;
	}
	
	public abstract double calculateServiceCost();
	
	public void printServiceDetails() {
		System.out.println("Brand Name:  " +brand);
		System.out.println("Model Name:  " +model);
		System.out.println("Fuel Type :  " +fuelType);
		System.out.println("Service Cost:  " +calculateServiceCost());
		
	}
}


class Car extends Vehicle {
	
	public Car(String brand,String model,String fuelType) {
		super(brand,model,fuelType);	
	}

	@Override
	public double calculateServiceCost() {
		return 5000.00;
	}
	
	@Override
	public void printServiceDetails() {
		System.out.println("Car details: ");
		super.printServiceDetails();
	}

}
class Bike extends Vehicle {
	
	public Bike(String brand,String model,String fuelType) {
		super(brand,model,fuelType);	
	}
	
	@Override 
	public double calculateServiceCost() {
		return 10000.00;
	}
	
	@Override
	public void printServiceDetails() {
		System.out.println("Bike details: ");
		super.printServiceDetails();
	}
	
}

class Truck extends Vehicle {
	
	public  Truck(String brand,String model,String fuelType) {
		super(brand,model,fuelType);	
	}

	@Override
	
	public double calculateServiceCost() {
		return 9000.00;
	}
	
	@Override
	public void printServiceDetails() {
		System.out.println("Truck details: ");
		super.printServiceDetails();
	}
}

public class VehicleManagement {
	public static void main(String[] args) {
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Car("Tesla","Model S","Diesel"));
		vehicles.add(new Bike("Honda","Shine","Petrol"));
		vehicles.add(new Truck("Volvo", "FH16", "Diesel"));
		
		for(Vehicle v:vehicles) {
			v.printServiceDetails();
			System.out.println();
		}
		
		
	}

}
