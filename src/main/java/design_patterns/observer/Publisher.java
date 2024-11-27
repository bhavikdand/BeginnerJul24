package design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private List<EventHandler> eventHandlerList;

    private Publisher(){
        eventHandlerList = new ArrayList<>();
    }

    private static Publisher INSTANCE = null;

    public static Publisher getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Publisher();
        }
        return INSTANCE;
    }

    public void register(EventHandler eh){
        eventHandlerList.add(eh);
    }

    public void deregister(EventHandler eh){
        eventHandlerList.remove(eh);
    }

    public void placeOrder(){
        for (EventHandler eh: eventHandlerList){
            eh.handle();
        }
    }
}
