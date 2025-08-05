package generics;

import java.util.*;

//Abstract class representing a Job Role
abstract class JobRole {
 protected String candidateName;
 protected int experience; // in years

 public JobRole(String candidateName, int experience) {
     this.candidateName = candidateName;
     this.experience = experience;
 }

 public abstract boolean screenResume(); // Custom logic for each role

 public void display() {
     System.out.println("Candidate: " + candidateName + ", Experience: " + experience + " years");
 }
}

//Software Engineer Role
class SoftwareEngineer extends JobRole {
 private int codingScore; // out of 100

 public SoftwareEngineer(String candidateName, int experience, int codingScore) {
     super(candidateName, experience);
     this.codingScore = codingScore;
 }

 @Override
 public boolean screenResume() {
     return experience >= 2 && codingScore >= 70;
 }
}

//Data Scientist Role
class DataScientist extends JobRole {
 private int mlProjects; // number of ML projects done

 public DataScientist(String candidateName, int experience, int mlProjects) {
     super(candidateName, experience);
     this.mlProjects = mlProjects;
 }

 @Override
 public boolean screenResume() {
     return experience >= 1 && mlProjects >= 3;
 }
}

//Product Manager Role
class ProductManager extends JobRole {
 private int productsLaunched;

 public ProductManager(String candidateName, int experience, int productsLaunched) {
     super(candidateName, experience);
     this.productsLaunched = productsLaunched;
 }

 @Override
 public boolean screenResume() {
     return experience >= 4 && productsLaunched >= 1;
 }
}

//Generic Resume class for any JobRole
class Resume<T extends JobRole> {
 private List<T> resumes = new ArrayList<>();

 public void addResume(T resume) {
     resumes.add(resume);
 }

 public void evaluateResumes() {
     for (T r : resumes) {
         r.display();
         if (r.screenResume()) {
             System.out.println("Status:  Selected\n");
         } else {
             System.out.println("Status:  Rejected\n");
         }
     }
 }

 // Generic static method using wildcard to screen any list of JobRole
 public static void processAll(List<? extends JobRole> resumeList) {
     for (JobRole r : resumeList) {
         r.display();
         if (r.screenResume()) {
             System.out.println("Status: Selected\n");
         } else {
             System.out.println("Status: Rejected\n");
         }
     }
 }
}

//Main class to run the system
public class ResumeScreeningSystem {
 public static void main(String[] args) {
     // Screening Software Engineers
     Resume<SoftwareEngineer> seResumes = new Resume<>();
     seResumes.addResume(new SoftwareEngineer("Alice", 3, 80));
     seResumes.addResume(new SoftwareEngineer("Bob", 1, 65));

     // Screening Data Scientists
     Resume<DataScientist> dsResumes = new Resume<>();
     dsResumes.addResume(new DataScientist("Carol", 2, 5));
     dsResumes.addResume(new DataScientist("Dave", 1, 1));

     // Screening Product Managers
     Resume<ProductManager> pmResumes = new Resume<>();
     pmResumes.addResume(new ProductManager("Eve", 5, 2));
     pmResumes.addResume(new ProductManager("Frank", 3, 0));

     System.out.println("=== Software Engineer Screening ===");
     seResumes.evaluateResumes();

     System.out.println("=== Data Scientist Screening ===");
     dsResumes.evaluateResumes();

     System.out.println("=== Product Manager Screening ===");
     pmResumes.evaluateResumes();

     // Wildcard method to screen all types of resumes
     System.out.println("=== Unified Resume Screening Pipeline ===");
     List<JobRole> allResumes = new ArrayList<>();
     allResumes.add(new SoftwareEngineer("Grace", 2, 75));
     allResumes.add(new DataScientist("Heidi", 1, 4));
     allResumes.add(new ProductManager("Ivan", 6, 1));

     Resume.processAll(allResumes);
 }
}