package design_patterns.observer;

public class BillingPlaceOrderEventHandler implements EventHandler{

    public BillingPlaceOrderEventHandler() {
        Publisher.getInstance().register(this);
    }

    @Override
    public void handle() {
        System.out.println("Creating bill");
    }
}
