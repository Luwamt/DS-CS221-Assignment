package assignment4;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList<Integer> sl = new SinglyLinkedList<>();

        sl.addNode(-6);
        sl.addNode(2);
        sl.addNode(3);
        sl.addNode(4);
        sl.addNode(9);

        System.out.println(sl);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(sl.size());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        boolean check = sl.find(4);
        System.out.println(check);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(sl.find(0));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(sl.max());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(sl.min());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    }
}
