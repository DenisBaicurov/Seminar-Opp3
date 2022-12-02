package PracticaOpp2;

import java.util.Iterator;

public class ListEmployee<T> implements Iterator<Node> {

    private Node current;

    public ListEmployee(Node first) {
        current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Node next() {
        Node tempo = current;
        current = current.getNext();
        return tempo;
    }
}
