class TextNode {
    String content;
    TextNode prev;
    TextNode next;

    TextNode(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}

class TextSetter {
    private TextNode head;
    private TextNode tail;
    private TextNode current;
    private int size;
    private final int MAX_SIZE = 10;

    public void addState(String text) {
        TextNode newState = new TextNode(text);

        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = newState;
            size = 1;
            return;
        }

        tail.next = newState;
        newState.prev = tail;
        tail = newState;
        current = newState;
        size++;

        if (size > MAX_SIZE) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo");
        }
    }

    public void display() {
        if (current == null) {
            System.out.println("Editor is empty");
        } else {
            System.out.println("Current Text: " + current.content);
        }
    }
}


public class TextEditor {

	public static void main(String[] args) {
		TextSetter edit = new TextSetter();

        edit.addState("Hello");
        edit.addState("Hello World");
        edit.addState("Hello World!");
        edit.display();

        edit.undo();
        edit.display();

        edit.undo();
        edit.display();

        edit.redo();
        edit.display();

        edit.addState("Hello Java");
        edit.display();

	}

}
