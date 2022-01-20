package assignment7;

import java.util.*;

public class BankOperation<E> implements MyQueue<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    private static class Node<E>{
        private E data;
        private Node<E> next;

   public Node(E data){
      this.data=data;
      this.next=null;
   }
   public Node(E data, Node<E> next){
   this.data=data;
   this.next=next;
   }

    }

    @Override
    public boolean add(E e) {
        Node<E> node= new Node<>(e);
        if (head == null){
            tail= node;
            head= tail;
        }else{
            tail.next= node;
            tail=tail.next;
        }
        size++;
        return true;
    }

    @Override
    public boolean offer(E e) {
        Node<E> node= new Node<>(e);
        if (head == null){
            tail= node;
            head= tail;
        }else{
            tail.next= node;
            tail=tail.next;
        }
        size++;
        return true;
    }

    @Override
    public E remove() {
        if (size== 0){
            throw new NoSuchElementException();
        }
        E hand = head.data;
        head=head.next;
        size--;
        return hand;
    }

    @Override
    public E poll() {
        if (size== 0){
            return  null;
        }
        E hand = head.data;
        head=head.next;
        size--;
        return hand;
    }

    @Override
    public E element() {
        if(size ==0)
            throw new NoSuchElementException();
        else
            return head.data;
    }

    @Override
    public E peek() {
        if(size ==0)
            return null;
        else
            return head.data;

    }

    @Override
    public int getSize() {
        return size;
    }
    @Override
    public boolean empty() {
        return head == null;
    }
    public String toString() {
        Node<E> current = head;
        StringBuilder result = new StringBuilder();
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(" ==> ");
            }
            current = current.next;
        }
        return result.toString();
    }


}
