package tad_down;

public class DoublyLinkedList {
    public Node head;

    public DoublyLinkedList() {
        head = null;
    }

    // Inserção em ordem crescente
    public void insertOrdered(int data) {
        Node newNode = new Node(data);
        if (head == null || data < head.data) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data < data) { // corrigido para ordem crescente
                current = current.next;
            }

            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public String printForward() {
        StringBuilder output = new StringBuilder("Lista (frente): ");
        Node current = head;
        while (current != null) {
            output.append(current.data).append(" ");
            current = current.next;
        }
        return output.toString() + "\n";
    }

    public String printBackward() {
        if (head == null) return "Lista (trás): \n";

        Node current = head;
        while (current.next != null) {
            current = current.next; // ir até o último nó
        }

        StringBuilder output = new StringBuilder("Lista (trás): ");
        while (current != null) {
            output.append(current.data).append(" ");
            current = current.prev;
        }
        return output.toString() + "\n";
    }

    public void remove(int data) {
        Node current = head;

        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) return;

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = head.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }
}
