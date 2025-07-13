package linkedlist;

class StudentNode{
	int rollNumber;
	String name;
	int age;
	String grade;
	StudentNode next;
	
	public StudentNode(int rollNumber,String name,int age,String grade) {
		this.rollNumber=rollNumber;
		this.name=name;
		this.age=age;
		this.grade=grade;
		this.next=null;
		
	}
	
}

class StudentList{
	private StudentNode head;
	
	//Add Student data at beginning
	public void addAtBeginning(StudentNode student) {
		student.next=head;
		head=student;
	}
	
	
	//Add student data At the middle
	public void addAtPosition(int position,StudentNode student) {
		if(position<=0) {
			System.out.println("Invalid Position");
			return;
		}
		if(position==1) {
			addAtBeginning(student);
			return ;
			
		}
		System.out.println("Add At Position: " +position);
		StudentNode temp=head;
		for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds. Adding at end.");
            addAtEnd(student);
            return;
        }

        student.next = temp.next;
        temp.next = student;
	}
	
	
	//Add Student data at the end
	public void addAtEnd(StudentNode student) {
		if(head==null) {
			head=student;
			return;
		}
		StudentNode temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=student;
	}
	
	
	//Delete record of Student
	public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Record deleted.");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
         }

        if (temp.next == null) {
            System.out.println("Record not found.");
            return;
        }

        temp.next = temp.next.next;
        System.out.println("Record deleted.");
    }

	
	//Search for student by rollNumber
	public void searchByRollNumber(int rollNumber) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Found: Roll No: " + temp.rollNumber + ", Name: " + temp.name
                		+ ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }
	
	//update Grade of Student Record
	 public void updateGrade(int rollNumber, String newGrade) {
	        StudentNode temp = head;
	        while (temp != null) {
	            if (temp.rollNumber == rollNumber) {
	                temp.grade = newGrade;
	                System.out.println("Grade updated.");
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Student not found.");
	    }
	
	//display Records
	public void displayRecords() {
		if(head==null) {
			System.out.println("No Records");
			return ;
		}
		StudentNode temp=head;
		while(temp!=null) {
			System.out.println("Roll Number: " +temp.rollNumber +", Student's Name: " +temp.name 
					+", Student's Age: " +temp.age +", Grade: " +temp.grade);
			temp=temp.next;
		}
	}
	
	
}

public class StudentManagement {
	public static void main(String[] args) {
		StudentList studentlist=new StudentList();
		StudentNode s1=new StudentNode(1,"Anaya",18,"A");
		StudentNode s2=new StudentNode(2,"Sara",19,"B");
		StudentNode s3 = new StudentNode(3, "Sophia", 19, "C");
		
		studentlist.addAtEnd(s2);
		studentlist.addAtBeginning(s1);
		studentlist.displayRecords();
		
		 studentlist.addAtPosition(2, s3);
		 studentlist.displayRecords();
		 
		 studentlist.searchByRollNumber(3);
		 studentlist.updateGrade(3, "A+");
		 studentlist.displayRecords();

	     studentlist.deleteByRollNumber(2);
	     studentlist.displayRecords();
		
	}

}
