import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 5.15);
        Item item2 = new Item("latte", 5.55);
        Item item3 = new Item("drip coffee", 3.15);
        Item item4 = new Item("capuccino", 5.30);

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Jimmy");

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item1);
        order2.addItem(item3);

        order3.addItem(item2);
        order3.addItem(item4);
        order3.addItem(item1);

        order4.addItem(item1);
        order4.addItem(item1);

        order5.addItem(item3);
        order5.addItem(item4);

        order2.setReady(true);
        order3.setReady(true);
        order5.setReady(true);

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Total for Order1: $%.2f\n", order1.getOrderTotal());
        
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
