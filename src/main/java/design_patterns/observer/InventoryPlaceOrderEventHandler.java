package design_patterns.observer;

public class InventoryPlaceOrderEventHandler implements EventHandler{

    public InventoryPlaceOrderEventHandler(){
        Publisher.getInstance().register(this);
    }


    @Override
    public void handle() {
        System.out.println("Handling inventory");
    }
}
