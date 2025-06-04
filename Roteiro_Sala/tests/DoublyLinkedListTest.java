import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tad_down.DoublyLinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoublyLinkedListTest {
    private DoublyLinkedList list;

    @BeforeEach
    public void initializeList() {
        list = new DoublyLinkedList();
    }

    @Test
    public void test_inserOrdered() {
        list.insertOrdered(10);
        assertEquals("10", list.head.toString());
        list.insertOrdered(20);
        assertEquals("10", list.head.toString());
        assertEquals("20", list.head.getNext().toString());
        list.insertOrdered(30);
        assertEquals("10", list.head.toString());
        assertEquals("20", list.head.getNext().toString());
        assertEquals("30", list.head.getNext().getNext().toString());
    }

    @Test
    public void test_printForward_when() {
        list.insertOrdered(10);
        list.insertOrdered(20);
        list.insertOrdered(30);
        list.insertOrdered(40);
        list.printForward();
    }
}
