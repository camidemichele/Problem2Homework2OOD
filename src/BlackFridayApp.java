public class BlackFridayApp {

    public void run() {

        // it creates the main category
        Category blackFriday = new Category("Black Friday Deals");


        Category electronics = new Category("Electronics");
        Category clothing = new Category("Clothing");

        // this adds products to electronics
        electronics.add(new Product("Laptop", 799.99));
        electronics.add(new Product("Smartphone", 499.99));
        electronics.add(new Product("Headphones", 99.99));

        // this adds products to Clothing
        clothing.add(new Product("Jacket", 59.99));

        // adds categories to the main category
        blackFriday.add(electronics);
        blackFriday.add(clothing);

        // it shows the product catalog
        System.out.println("Product Catalog:");
        blackFriday.display();

        System.out.println();

        // creates customers
        Customer customer1 = new Customer("V");
        Customer customer2 = new Customer("JK");
        Customer customer3 = new Customer("Jimin");

        // creates the notification system
        BlackFridayDeals deals = new BlackFridayDeals();

        // subscribes two customers
        deals.registerCustomer(customer1);
        deals.registerCustomer(customer2);

        // notify customers about the deal
        System.out.println("Notifying customers about a deal:");

        deals.notifyCustomers(
                "New deal available! Huge discounts on Electronics!"
        );

        // customer 3 is not subscribed
        System.out.println(
                "Customer Jimin is not subscribed to deal notifications."
        );
    }

    public static void main(String[] args) {
        BlackFridayApp app = new BlackFridayApp();
        app.run();
    }
}