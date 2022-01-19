package assignment5;

import org.w3c.dom.Node;

import java.util.*;

public class KWLinkedList<E> extends AbstractSequentialList<E> implements Iterable<E> {
    /**
     * A reference to the head of the list.
     */
    private Node head = null;
    /**
     * A reference to the end of the list.
     */
    private Node tail = null;
    /**
     * The size of the list.
     */
    private int size = 0;
    public Node current = head;

    @Override
    public Iterator<E> iterator() {
        return iterator();
    }

    class MyIterator<E> implements Iterator<E> {
        public MyIterator() {
        }



        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (current == null) throw new NoSuchElementException();
            return null;
        }
    }


    //Methods
    /*<exercise chapter="2" section="8" type="programming" number="4">*/

    /**
     * Insert an object at the beginning of the list.
     *
     * @param item - the item to be added
     */
    public void addFirst(E item) {
        add(0, item);
    }

    public void addLast(E item) {
        add(size, item);
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    public void removeAllOf(String target) {
        Iterator it = iterator();
        while (it.hasNext()){
           String item = (String) it.next();
           if (target.equalsIgnoreCase(item)){
               it.remove();
           }
        }

    }

}
