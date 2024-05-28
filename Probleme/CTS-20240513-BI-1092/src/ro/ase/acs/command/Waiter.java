package ro.ase.acs.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<FoodOrder> orders = new ArrayList<>();
    public void takeOrder(FoodOrder order){
        orders.add(order);
    }
    public void sendOrdersToKitchen(){
       orders.forEach(x->x.prepare());
       orders.clear();
    }
}
