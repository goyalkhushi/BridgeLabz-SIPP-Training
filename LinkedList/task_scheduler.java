package linkedlist;
 
import java.util.*;

class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;

    Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    private Task head = null;
    private Task current = null;

    // Add Task at Beginning
    public void addTaskAtBeginning(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newTask.next = head;
            temp.next = newTask;
            head = newTask;
        }
    }

    // Add Task at End
    public void addTaskAtEnd(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
        }
    }

    // Add Task at Specific Position
    public void addTaskAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos <= 0) {
            System.out.println("Invalid position. Use 1 or greater.");
            return;
        }
        if (pos == 1) {
            addTaskAtBeginning(id, name, priority, dueDate);
            return;
        }

        Task newTask = new Task(id, name, priority, dueDate);
        Task temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        newTask.next = temp.next;
        temp.next = newTask;
    }

    // Remove Task by ID
    public void removeTaskById(int id) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Task temp = head, prev = null;

        // Special case for head
        if (head.id == id) {
            if (head.next == head) {
                head = null;
                return;
            }
            Task last = head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = head.next;
            head = head.next;
            return;
        }

        do {
            prev = temp;
            temp = temp.next;
            if (temp.id == id) {
                prev.next = temp.next;
                return;
            }
        } while (temp != head);

        System.out.println("Task with ID " + id + " not found.");
    }

    // View and Move to Next Task
    public void viewCurrentAndMoveNext() {
        if (current == null) {
            current = head;
        }
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Current Task: [" + current.id + ", " + current.name + ", Priority: " + current.priority + ", Due: " + current.dueDate + "]");
        current = current.next;
    }

    // Display All Tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.id + ", Name: " + temp.name + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search Task by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        boolean found = false;
        Task temp = head;

        do {
            if (temp.priority == priority) {
                System.out.println("Task ID: " + temp.id + ", Name: " + temp.name + ", Due Date: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with Priority: " + priority);
        }
    }
}

public class task_scheduler {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Sample tasks
        scheduler.addTaskAtEnd(1, "Write Report", 2, "2025-07-10");
        scheduler.addTaskAtBeginning(2, "Team Meeting", 1, "2025-07-08");
        scheduler.addTaskAtEnd(3, "Code Review", 3, "2025-07-12");
        scheduler.addTaskAtPosition(2, 4, "Client Call", 1, "2025-07-09");

        System.out.println("\nAll Tasks:");
        scheduler.displayTasks();

        System.out.println("\nSearching for Priority 1 tasks:");
        scheduler.searchByPriority(1);

        System.out.println("\nView and Move Through Tasks:");
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();

        System.out.println("\nRemoving Task with ID 2:");
        scheduler.removeTaskById(2);
        scheduler.displayTasks();
    }
}
 
