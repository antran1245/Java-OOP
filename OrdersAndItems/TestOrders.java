import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 5.15;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 5.55;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 3.15;

        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 5.30;
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cinduri";

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.items = new ArrayList<Item>();
        order2.items.add(item1);
        order2.total += item1.price;

        Order order3 = new Order();
        order3.name = "Noah";
        order3.items = new ArrayList<Item>();
        order3.items.add(item4);
        order3.total += item4.price;

        Order order4 = new Order();
        order4.name = "Sam";
        order4.items = new ArrayList<Item>();
        order4.items.add(item2);
        order4.total += item2.price;

        order1.ready = true;

        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += (item2.price * 2);

        order2.ready = true;

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: $%.2f\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        
    }
}
