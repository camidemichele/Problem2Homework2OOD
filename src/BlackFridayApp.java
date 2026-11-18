public class BlackFridayApp {

    public void run() {

        // Create the main category
        Category blackFriday = new Category("Black Friday Deals");

        // Create the smaller categories
        Category electronics = new Category("Electronics");
        Category clothing = new Category("Clothing");

        // Add products to Electronics
        electronics.add(new Product("Laptop", 799.99));
        electronics.add(new Product("Smartphone", 499.99));
        electronics.add(new Product("Headphones", 99.99));

        // Add products to Clothing
        clothing.add(new Product("Jacket", 59.99));

        // Add categories to the main category
        blackFriday.add(electronics);
        blackFriday.add(clothing);

        // Display the product catalog
        System.out.println("Product Catalog:");
        blackFriday.display();

        System.out.println();

        // Create customers
        Customer customer1 = new Customer("V");
        Customer customer2 = new Customer("JK");
        Customer customer3 = new Customer("Jimin");

        // Create the notification system
        BlackFridayDeals deals = new BlackFridayDeals();

        // Subscribe two customers
        deals.registerCustomer(customer1);
        deals.registerCustomer(customer2);

        // Notify customers about the deal
        System.out.println("Notifying customers about a deal:");

        deals.notifyCustomers(
                "New deal available! Huge discounts on Electronics!"
        );

        // Customer 3 is not subscribed
        System.out.println(
                "Customer Jimin is not subscribed to deal notifications."
        );
    }

    public static void main(String[] args) {
        BlackFridayApp app = new BlackFridayApp();
        app.run();
    }
}