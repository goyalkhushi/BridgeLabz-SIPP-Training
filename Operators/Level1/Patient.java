package level1;

class Patient {
   
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

   
    final int patientID;

    String name;
    int age;
    String ailment;

    
    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;   
        totalPatients++;              
    }

    
    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

  
    void displayDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }

    public static void main(String[] args) {
      
        Patient p1 = new Patient("Arjun Singh", 35, "Fever", 1001);
        Patient p2 = new Patient("Priya Sharma", 28, "Migraine", 1002);

        
        if (p1 instanceof Patient) {
            System.out.println("\nPatient 1 Details:");
            p1.displayDetails();
        }

        if (p2 instanceof Patient) {
            System.out.println("\nPatient 2 Details:");
            p2.displayDetails();
        }

        System.out.println();
        Patient.getTotalPatients();
    }
}
