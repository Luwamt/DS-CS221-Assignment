package assignment3;

import java.util.ArrayList;
import java.util.List;

public class MarketingDemo {
    public static void main(String[] args) {
        List<Marketing> list = new ArrayList<>();
        //add() // adding objects to the Marketing
        Marketing mk = new Marketing("Mercy","Magazine",5);
        Marketing mk2 = new Marketing("Arkan", "CD",50);
        Marketing mk3 = new Marketing("Haile", "Laptop",1550);
        Marketing mk4 = new Marketing("Fili", "Lard drive",150);
        list.add(mk);
        list.add(mk2);
        list.add(mk3);
        list.add(mk4);
        list.add( new Marketing("Lwam","Book", 50));
        System.out.println(list +"\n ");
        //remove() // delete objects from Marketing
        list.remove(mk2);
        System.out.println(list +"\n ");
        //set() // Modify some objects using set() method
        list.set(0, new Marketing("John","Computer", 2000));
        System.out.println(list +"\n ");
        //Get the size of the list.
        System.out.println("The Size of  Marketing Objects are: "+ list.size());
        // Calculate the total sales-amount and print the same to the console
        int sum =0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i).getSales_amount();
        }
        System.out.println("The sum of  Sales_amount: "+sum);
        //Use get() method
        System.out.println(list.get(3) +"\n");
        // Use clear() method
        list.clear();
        System.out.println("After removing the marketing object: "+list +"\n");
    }
}
