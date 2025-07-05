package workshop;
import java.util.*;

abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    
    public double getFinalPrice() {
        return price - calculateDiscount();
    }

    
    public void printBill() {
        System.out.println("Product: " + name);
        System.out.println("Original Price: Rs. " + price);
        System.out.println("Discount Applied: Rs. " + calculateDiscount());
        System.out.println("Final Price: Rs. " + getFinalPrice());
        System.out.println("------------------------");
    }
}


class Electronics extends Product {

    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10;
    }
}


class Clothing extends Product {

    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20; 
    }
}


class Grocery extends Product {

    public Grocery(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return 0; 
    }
}


public class OnlineStoreBilling {
    public static void main(String[] args) {

        
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("Laptop", 60000));
        products.add(new Clothing("T-Shirt", 1500));
        products.add(new Grocery("Rice Bag", 1200));

       
        for (Product p : products) {
            p.printBill();
        }
    }
}