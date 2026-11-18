public class Product extends ProductComponent {

    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    // Displays the product and its price
    @Override
    public void display() {
        System.out.printf("Product: %s, Price: $%.2f%n", name, price);
    }
}