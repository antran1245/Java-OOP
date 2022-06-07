import java.util.ArrayList;

public class Order {

    private String name;
    private ArrayList<Item> items;
    private double total;

    public Order(String name) {
        this.name = name;
        items = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }

    public void addItem(Item item) {
        items.add(item);
        total += item.getPrice();
    }

    public void displayOrder() {
        System.out.printf("Customer Name: %s\n",  name);
        for (Item item : items) {
            System.out.printf("%s : %.2f\n", item.getName(), item.getPrice());
        }
        System.out.printf("Total: $%.2f\n", total);
    }
}