package tad_down;

public class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null; // corrigido
    }

    @Override
    public String toString() {
        return "" + data;
    }

    public Node getNext() {
        return next;
    }
}
