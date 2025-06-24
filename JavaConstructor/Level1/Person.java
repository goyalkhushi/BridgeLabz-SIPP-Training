package level1;

public class Person {
    
	
    String name;
    int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

   
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

   
    public static void main(String[] args) {
        
        Person p1 = new Person("Alice", 25);
        System.out.println("Original Person:");
        p1.displayPersonInfo();

        System.out.println();

       
        Person p2 = new Person(p1);
        System.out.println("Cloned Person:");
        p2.displayPersonInfo();
    }
}
