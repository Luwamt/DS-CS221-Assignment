package assignment4;

public class DoublyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size =0;

    private static class Node<E> {
        private Node<E> next;
        private Node<E> prev;
        private E data;

        public Node(E data) {
            this.data =data;
            this.next= null;
            this.prev= null;
        }
     public Node(E data , Node<E> nextRef){
         this.data =data;
         this.next= nextRef;
     }
    }
    private void addFirst(E item){
    Node<E> current = new Node<>(item);
     if(head==null){
        tail= current;
     }else{
        current.next=head;
        head.prev=current;
     }
          head=current;
     size++;
  }

    private void addAfter(Node<E> node, E item){
        Node<E> current = new Node<>(item);
        current.prev= node;
        if (node.next==null){
            current.next=null;
        }
        else {
            current.next=node.next;
            node.next.prev=current;
        }
        node.next=current;
    }
}