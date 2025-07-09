package stackandqueue;
import java.util.*;


public class QueueusingStacks {
    private Stack<Integer> stack1; // For enqueue
    private Stack<Integer> stack2; // For dequeue

    public QueueusingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int data) {
        stack1.push(data);
        System.out.println("Enqueued: " + data);
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

   
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }


    public static void main(String[] args) {
        QueueusingStacks queue = new QueueusingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Front element: " + queue.peek()); 
        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 
    }
}

