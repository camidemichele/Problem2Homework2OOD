
import java.util.ArrayList;
import java.util.List;

public class Category extends ProductComponent {

    // stores the category name
    private String name;

    // list that can store products or other categories
    private List<ProductComponent> components;

    // constructor
    public Category(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    // returns the category name
    @Override
    public String getName() {
        return name;
    }

    // calculates the total price of everything in the category
    @Override
    public double getPrice() {
        double total = 0;

        // goes through every product or category
        for (ProductComponent component : components) {
            total += component.getPrice();
        }

        return total;
    }

    // adds a product or another category
    public void add(ProductComponent component) {
        components.add(component);
    }

    // displays the category and everything inside it
    @Override
    public void display() {
        System.out.println("Category: " + name);

        for (ProductComponent component : components) {
            component.display();
        }
    }
}
