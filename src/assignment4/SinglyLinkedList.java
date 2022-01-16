package assignment4;

public class SinglyLinkedList<E>{
    private Node <E> head = null;
    private int size=0;

    private static class Node<E> {
        private Node<E> next;
        private E data;

        private Node(E item, Node<E> nodeRef) {
            this.data = item;
            this.next = nodeRef;
        }
        private Node(E item) {
            this.data = item;
            this.next = null;
        }
    }
    private void addFirst(E item){
        Node<E> temp = new Node<>(item, head);
        head =temp;
        size++;
    }
    private void addFirstIndex(int item){
        head = new Node(item, head);
        //head =temp;
        size++;
    }
    private void addAfter(E item, Node<E> node){
        Node<E> temp = new Node<>(item, node.next);
        node.next =temp;
        size++;
    }
    private E removeFirst() {
        Node<E> temp = head;
        if (head != null) {
            head = head.next;
            size--;
            return temp.data;
        }
        else
            return null;
    }
    private E removeAfter(Node<E> node) {
        Node<E> temp = node.next;
        if (temp != null) {
            node.next = temp.next;
            size--;
            return temp.data;
        }
        else
            return null;
    }
    private Node<E> getNode(int index) {
        Node<E> node = head;
        for (int i = 0; i < index && node != null; i++) {
            node= node.next;
        }
        return node;
    }
    @Override
    public  String toString(){
        Node<E> temp = head;
        StringBuilder result= new StringBuilder();
        while (temp!=null){
            result.append(temp.data);
            if (temp.next!= null)
                result.append("==>");
            temp= temp.next;
        }
        return result.toString();
    }
    public int size() {
        return size;
    }
    public void addNode(int item){
        head = new Node(item,head);
        size++;
    }
    public boolean find(int item) {
        Node<E> temp = head;
        while (temp!=null){
            if ((int)temp.data==item){
                item =(int)temp.data;
               return true;
            }
            temp= temp.next;
        }
        return false;
    }

    public int max() {
        if (head == null) throw  new IndexOutOfBoundsException();
        Node current = head;
        //Node<E> max = getNode(0);
        int max = (int)current.data;
        while (current!=null){
            if ((int)current.data > max){
                max = (int)current.data;
            }
            current=current.next;
        }
        return max;
    }
    public int min() {
        Node node = head;
        int min = (int)node.data;
        while (node!=null){
            if ((int)node.data < min){
                min = (int)node.data;
            }
            node=node.next;
        }
        return min;
    }
}
