package src.Persons.Employees;

import java.util.Map;

import src.FoodItems.FoodItem;
import src.FoodOrders.FoodOrder;

public class Chef extends Employee {

    public Chef(String name, int age, String address, int salary, int employeeId) {
        super(name, age, address, salary, employeeId);
    }

    public void prepareFood(FoodOrder fo){
        Map<FoodItem, Integer> orderMenu = fo.getOrderMenu();

        for(FoodItem food : orderMenu.keySet()){
            for(int i=0;i<orderMenu.get(food); i++){

                System.out.println(this.getName() + " was cooking " + food.getName());
            }
        }

        System.out.println(this.getName() + " took " + fo.getTotalMinutes() + " minutes to cook.");

    }
    
}
