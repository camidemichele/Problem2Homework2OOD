import java.util.ArrayList;
import java.util.List;

public class BlackFridayDeals {

    private List<CustomerObserver> customers;

    public BlackFridayDeals() {
        customers = new ArrayList<>();
    }

    public void registerCustomer(CustomerObserver customer) {
        customers.add(customer);
    }

    public void notifyCustomers(String deal) {
        for (CustomerObserver customer : customers) {
            customer.receiveNotification(deal);
        }
    }
}

