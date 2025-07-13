 package linkedlist;

import java.util.*;

// Node class
class Node {
    String title;
    String director;
    int year;
    double rating;
    Node prev, next;

    public Node(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}

// Doubly Linked List class
class Dll {
    Node head, tail;

    public void addBeginning(String title, String director, int year, double rating) {
        Node newNode = new Node(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addEnd(String title, String director, int year, double rating) {
        Node newNode = new Node(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 1 || head == null) {
            addBeginning(title, director, year, rating);
            return;
        }

        Node newNode = new Node(title, director, year, rating);
        Node temp = head;
        int count = 1;

        while (temp.next != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp.next == null) {
            addEnd(title, director, year, rating);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    public void removeByTitle(String title) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head && temp == tail) {
                    head = tail = null;
                } else if (temp == head) {
                    head = head.next;
                    head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Movie '" + title + "' removed successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    public void searchByDirector(String director) {
        boolean found = false;
        Node temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                printMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found by director: " + director);
    }

    public void searchByRating(double rating) {
        boolean found = false;
        Node temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                printMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found with rating: " + rating);
    }

    public void updateRating(String title, double newRating) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("No movies to display.");
            return;
        }
        Node temp = head;
        System.out.println("Movies (Forward):");
        while (temp != null) {
            printMovie(temp);
            temp = temp.next;
        }
    }

    public void displayBackward() {
        if (tail == null) {
            System.out.println("No movies to display.");
            return;
        }
        Node temp = tail;
        System.out.println("Movies (Reverse):");
        while (temp != null) {
            printMovie(temp);
            temp = temp.prev;
        }
    }

    private void printMovie(Node node) {
        System.out.println("Title: " + node.title + ", Director: " + node.director +
                ", Year: " + node.year + ", Rating: " + node.rating);
    }
}

// Main class
public class movie_management {
    public static void main(String[] args) {
        Dll movieList = new Dll();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Movie Management System ====");
            System.out.println("1. Add Movie at Beginning");
            System.out.println("2. Add Movie at End");
            System.out.println("3. Add Movie at Specific Position");
            System.out.println("4. Remove Movie by Title");
            System.out.println("5. Search by Director");
            System.out.println("6. Search by Rating");
            System.out.println("7. Update Movie Rating");
            System.out.println("8. Display Movies Forward");
            System.out.println("9. Display Movies Reverse");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // Clear buffer

            String title, director;
            int year, position;
            double rating;

            switch (choice) {
                case 1:
                    System.out.print("Enter Title: ");
                    title = sc.nextLine();
                    System.out.print("Enter Director: ");
                    director = sc.nextLine();
                    System.out.print("Enter Year: ");
                    year = sc.nextInt();
                    System.out.print("Enter Rating: ");
                    rating = sc.nextDouble();
                    movieList.addBeginning(title, director, year, rating);
                    break;

                case 2:
                    System.out.print("Enter Title: ");
                    title = sc.nextLine();
                    System.out.print("Enter Director: ");
                    director = sc.nextLine();
                    System.out.print("Enter Year: ");
                    year = sc.nextInt();
                    System.out.print("Enter Rating: ");
                    rating = sc.nextDouble();
                    movieList.addEnd(title, director, year, rating);
                    break;

                case 3:
                    System.out.print("Enter Position: ");
                    position = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    title = sc.nextLine();
                    System.out.print("Enter Director: ");
                    director = sc.nextLine();
                    System.out.print("Enter Year: ");
                    year = sc.nextInt();
                    System.out.print("Enter Rating: ");
                    rating = sc.nextDouble();
                    movieList.addAtPosition(position, title, director, year, rating);
                    break;

                case 4:
                    System.out.print("Enter Title to Remove: ");
                    title = sc.nextLine();
                    movieList.removeByTitle(title);
                    break;

                case 5:
                    System.out.print("Enter Director to Search: ");
                    director = sc.nextLine();
                    movieList.searchByDirector(director);
                    break;

                case 6:
                    System.out.print("Enter Rating to Search: ");
                    rating = sc.nextDouble();
                    movieList.searchByRating(rating);
                    break;

                case 7:
                    System.out.print("Enter Movie Title to Update Rating: ");
                    title = sc.nextLine();
                    System.out.print("Enter New Rating: ");
                    rating = sc.nextDouble();
                    movieList.updateRating(title, rating);
                    break;

                case 8:
                    movieList.displayForward();
                    break;

                case 9:
                    movieList.displayBackward();
                    break;

                case 0:
                    System.out.println("Exiting Movie Management System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}
