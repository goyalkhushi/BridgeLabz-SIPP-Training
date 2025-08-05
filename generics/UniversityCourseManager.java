package generics;

import java.util.*;

//Abstract base class for course types
abstract class CourseType {
 protected String courseName;
 protected String instructor;

 public CourseType(String courseName, String instructor) {
     this.courseName = courseName;
     this.instructor = instructor;
 }

 public abstract void evaluate();

 public void displayInfo() {
     System.out.println("Course: " + courseName + ", Instructor: " + instructor);
 }
}

//Exam-Based Course
class ExamCourse extends CourseType {
 private int totalMarks;

 public ExamCourse(String courseName, String instructor, int totalMarks) {
     super(courseName, instructor);
     this.totalMarks = totalMarks;
 }

 @Override
 public void evaluate() {
     System.out.println(courseName + " is evaluated based on an exam of " + totalMarks + " marks.");
 }
}

//Assignment-Based Course
class AssignmentCourse extends CourseType {
 private int numAssignments;

 public AssignmentCourse(String courseName, String instructor, int numAssignments) {
     super(courseName, instructor);
     this.numAssignments = numAssignments;
 }

 @Override
 public void evaluate() {
     System.out.println(courseName + " is evaluated through " + numAssignments + " assignments.");
 }
}

//Research-Based Course
class ResearchCourse extends CourseType {
 private String researchTopic;

 public ResearchCourse(String courseName, String instructor, String researchTopic) {
     super(courseName, instructor);
     this.researchTopic = researchTopic;
 }

 @Override
 public void evaluate() {
     System.out.println(courseName + " is evaluated based on research: " + researchTopic);
 }
}

//Generic Course class that works with any CourseType
class Course<T extends CourseType> {
 private List<T> courseList;

 public Course() {
     courseList = new ArrayList<>();
 }

 public void addCourse(T course) {
     courseList.add(course);
 }

 public void showCourses() {
     for (T course : courseList) {
         course.displayInfo();
         course.evaluate();
         System.out.println();
     }
 }

 // Static method to handle any type of course using wildcards
 public static void processAnyCourse(List<? extends CourseType> courses) {
     for (CourseType course : courses) {
         course.displayInfo();
         course.evaluate();
         System.out.println();
     }
 }
}

//Main class to demonstrate the system
public class UniversityCourseManager {
 public static void main(String[] args) {
     Course<ExamCourse> examCourses = new Course<>();
     examCourses.addCourse(new ExamCourse("Mathematics", "Dr. Sharma", 100));
     examCourses.addCourse(new ExamCourse("Physics", "Dr. Verma", 80));

     Course<AssignmentCourse> assignmentCourses = new Course<>();
     assignmentCourses.addCourse(new AssignmentCourse("English", "Prof. Mehta", 4));

     Course<ResearchCourse> researchCourses = new Course<>();
     researchCourses.addCourse(new ResearchCourse("AI Research", "Dr. Rao", "Machine Learning Algorithms"));

     System.out.println("=== Exam Courses ===");
     examCourses.showCourses();

     System.out.println("=== Assignment Courses ===");
     assignmentCourses.showCourses();

     System.out.println("=== Research Courses ===");
     researchCourses.showCourses();

     // Using wildcard method
     System.out.println("=== Processing All Courses with Wildcard ===");
     List<CourseType> allCourses = new ArrayList<>();
     allCourses.add(new ExamCourse("Chemistry", "Dr. Gupta", 90));
     allCourses.add(new AssignmentCourse("History", "Prof. Kapoor", 5));
     allCourses.add(new ResearchCourse("Neural Networks", "Dr. Bose", "Deep Learning"));

     Course.processAnyCourse(allCourses);
 }
}