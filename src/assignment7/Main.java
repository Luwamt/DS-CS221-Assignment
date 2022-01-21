package assignment7;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        BankOperation<Customer> customer = new BankOperation<>();
        customer.offer(new Customer("Luwam", 111));
        customer.offer(new Customer("Mercy", 112));
        customer.offer(new Customer("Abiel", 113));
        customer.offer(new Customer("Arkan", 114));

        System.out.println(customer);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Currently Serving: " + customer.poll() +"          Next Customers :"+customer+ "\n");
                if (customer.getSize() == 0) {
                    timer.cancel();
                }
            }
        };
        timer.schedule(task,0,5000);
    }
}
