package hashfunctions;
import java.util.*;

class CustomHashMap {
    private static class Node {
        int key, value;
        Node next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 1000;
    private Node[] buckets;

    public CustomHashMap() {
        buckets = new Node[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node head = buckets[index];

        Node curr = head;
        while (curr != null) {
            if (curr.key == key) {
                curr.value = value; // update
                return;
            }
            curr = curr.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = head;
        buckets[index] = newNode;
    }

    public Integer get(int key) {
        int index = hash(key);
        Node curr = buckets[index];
        while (curr != null) {
            if (curr.key == key) return curr.value;
            curr = curr.next;
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        Node curr = buckets[index], prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    buckets[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}

public class CustomHashMapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomHashMap map = new CustomHashMap();

        while (true) {
            System.out.println("\n1. Put  2. Get  3. Remove  4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key and value to put: ");
                    int k1 = sc.nextInt();
                    int v1 = sc.nextInt();
                    map.put(k1, v1);
                    System.out.println("Inserted.");
                    break;
                case 2:
                    System.out.print("Enter key to get value: ");
                    int k2 = sc.nextInt();
                    Integer val = map.get(k2);
                    System.out.println(val != null ? "Value: " + val : "Key not found.");
                    break;
                case 3:
                    System.out.print("Enter key to remove: ");
                    int k3 = sc.nextInt();
                    map.remove(k3);
                    System.out.println("Removed if existed.");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
