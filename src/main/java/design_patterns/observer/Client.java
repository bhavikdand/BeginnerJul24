package design_patterns.observer;

public class Client {

    public static void main(String[] args) {
        new InventoryPlaceOrderEventHandler();

        Publisher.getInstance().placeOrder();
        System.out.println("------------------");
        new BillingPlaceOrderEventHandler();
        Publisher.getInstance().placeOrder();
    }
}
