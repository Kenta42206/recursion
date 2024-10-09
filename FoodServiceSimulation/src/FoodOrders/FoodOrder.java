package src.FoodOrders;

import java.util.Map;

import src.FoodItems.FoodItem;

public class FoodOrder {
    private int totalPrice;
    private int totalMinutes;
    private Map<FoodItem, Integer> orderMenu;

    public FoodOrder(int totalPrice, int totalMinutes, Map<FoodItem, Integer> orderMenu){
        this.orderMenu = orderMenu;
        this.totalPrice = totalPrice;
        this.totalMinutes = totalMinutes;
    }

    public int getTotalMinutes(){
        return this.totalMinutes;
    }

    public int getTotalPrice(){
        return this.totalPrice;
    }

    public Map<FoodItem, Integer> getOrderMenu(){
        return this.orderMenu;
    }


    
}
