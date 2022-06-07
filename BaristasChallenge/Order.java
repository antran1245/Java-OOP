import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order() {
        name = "Guest";
        items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        items = new ArrayList<Item>();
    }

    public void setName(String name) {
        this.name = name;
    } 
    public String getName() {
        return name;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public boolean getReady() {
        return ready;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    public ArrayList<Item> getItem() {
        return new ArrayList<Item>();
    }
    public void addItem(Item item) {
        items.add(item);
    }

    public String getStatusMessage() {
        if(ready) {
            return "Your order is ready.";
        }
        return "Thank you for waiting. Your order will be ready soon.";
    }

    public double getOrderTotal() {
        double total = 0;
        for(Item item: items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.printf("Customer Name: %s\n", name);
        for(Item item: items) {
            System.out.printf("%s - $%.2f\n", item.getName(), item.getPrice());
        }
        System.out.printf("Total: $%.2f\n", this.getOrderTotal());
    }
}