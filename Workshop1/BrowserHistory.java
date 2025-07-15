package workshop;

import java.util.*;

class Node {
    String url;
    Node prev, next;

    public Node(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}


abstract class Navigation {
    abstract void visit(String url);
    abstract void forward();
    abstract void backward(); 
    abstract String getCurrPage();
}


class History extends Navigation {
    private Node curr;

    @Override
    public void visit(String url) {
        Node newNode = new Node(url);
        if (curr != null) {
            curr.next = newNode;
            newNode.prev = curr;
        }
        curr = newNode;
        System.out.println("Visited: " + url);
    }

    @Override
    public void backward() {
        if (curr != null && curr.prev != null) {
            curr = curr.prev;
            System.out.println("Went back to: " + curr.url);
        } else {
            System.out.println("No previous ");
        }
    }

    @Override
    public void forward() {
        if (curr != null && curr.next != null) {
            curr = curr.next;
            System.out.println("Forward to: " + curr.url);
        } else {
            System.out.println("No next ");
        }
    }

    @Override
    public String getCurrPage() {
        return (curr != null) ? curr.url : "No page visited";
    }
}


public class BrowserHistory {
    public static void main(String[] args) {
        History h1 = new History(); 

        h1.visit("https://google.com");
        h1.visit("https://brave.com");
        h1.visit("https://gfg.com");

        System.out.println("Current Page: " + h1.getCurrPage());
        System.out.println();
        h1.backward(); // brave
        h1.backward(); // google
        h1.forward();  // brave

        System.out.println("Current Page: " + h1.getCurrPage());
    }
}
