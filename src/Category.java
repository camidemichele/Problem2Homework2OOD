import java.util.ArrayList;
import java.util.List;

public class Category extends ProductComponent {

    private String name;
    private List<ProductComponent> components;

    public Category(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double total = 0;

        for (ProductComponent component : components) {
            total += component.getPrice();
        }

        return total;
    }

    public void add(ProductComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        System.out.println("Category: " + name);

        for (ProductComponent component : components) {
            component.display();
        }
    }
}