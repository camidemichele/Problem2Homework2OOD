public class Customer implements CustomerObserver {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String deal) {
        System.out.println("Dear " + name + ", " + deal);
    }
}