import java.util.ArrayList;
import java.util.List;

public class BlackFridayDeals {

    // list to store the customers that subscribed
    private List<CustomerObserver> customers;

    // creates an empty list of customers
    public BlackFridayDeals() {
        customers = new ArrayList<>();
    }

    // adds a customer to the list
    public void registerCustomer(CustomerObserver customer) {
        customers.add(customer);
    }

    // sends the new deal to all subscribed customers
    public void notifyCustomers(String deal) {

        // goes through the list one customer at a time
        for (CustomerObserver customer : customers) {

            // tells each customer about the deal
            customer.receiveNotification(deal);
        }
    }
}


