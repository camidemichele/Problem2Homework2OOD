public class Product extends ProductComponent {

    // it stores the product name and price
    private String name;
    private double price;

    // constructor that sets the name and price
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // returns the name of the product
    @Override
    public String getName() {
        return name;
    }

    // returns the price of the product
    @Override
    public double getPrice() {
        return price;
    }

    // displays the product name and price
    @Override
    public void display() {

        // prints the price with two decimal places
        System.out.printf("Product: %s, Price: $%.2f%n", name, price);
    }
}
