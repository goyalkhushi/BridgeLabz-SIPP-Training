package linkedlist;

class TextState {
    String content;
    TextState prev;
    TextState next;

    TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}

class TextEditor {
    private TextState head = null;
    private TextState current = null;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    // Add a new state
    public void type(String newText) {
        TextState newState = new TextState(newText);

        // Remove redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
        }

        if (head == null) {
            head = newState;
        } else {
            current.next = newState;
            newState.prev = current;
        }

        current = newState;
        size++;

        // Enforce history size limit
        while (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }

        System.out.println("Typed: " + newText);
    }

    // Undo action
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed.");
        } else {
            System.out.println("No more undo available.");
        }
    }

    // Redo action
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed.");
        } else {
            System.out.println("No more redo available.");
        }
    }

    // Display current text
    public void display() {
        if (current == null) {
            System.out.println("Editor is empty.");
        } 
        else {
            System.out.println("Current Text: \"" + current.content + "\"");
        }
    }
}

public class undo_redo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Simulate typing
        editor.type("Hello");
        editor.type("Hello, World!");
        editor.type("Hello, Java!");
        editor.display();

        // Undo actions
        editor.undo();
        editor.display();

        editor.undo();
        editor.display();

        // Redo action
        editor.redo();
        editor.display();

        // Type new text after undo (clears redo history)
        editor.type("Hello again!");
        editor.display();

        // Try more undo/redo to test limit
        for (int i = 1; i <= 12; i++) {
            editor.type("Step " + i);
        }

        editor.display();
    }
}

