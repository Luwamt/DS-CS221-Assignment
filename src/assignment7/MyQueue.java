package assignment7;

public interface MyQueue<E> {

    boolean empty() ;


    boolean add(E e);

    boolean offer(E e);

    E remove();

    E poll();

    E element();

    E peek();

    int getSize();
}


