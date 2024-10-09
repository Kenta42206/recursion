package src.Persons;


import java.util.Map;
import java.util.HashMap;

import src.FoodItems.FoodItem;
import src.FoodOrders.FoodOrder;
import src.Invoices.Invoice;
import src.Persons.Employees.Casher;
import src.Persons.Employees.Employee;
import src.Restaurants.Restaurant;

public class Customer extends Person {
    private Map<String, Integer> interestedFoodsMap;
    public Customer(String name, int age, String address, Map<String, Integer> interestedFoodsMap) {
        super(name, age, address);
        this.interestedFoodsMap = interestedFoodsMap;
    }

    // Customerが興味のあるFoodItemを出力するメソッド

    public Map<FoodItem, Integer> interestedCategories(Restaurant r){
        String interestedFoodStr = "";
        FoodItem[] menu = r.getMenu();
        Map<FoodItem, Integer> interestedFoodsInMenu = new HashMap<>();

        for(String interestedFood : this.interestedFoodsMap.keySet()){
            for(FoodItem food : menu){
                // レストランのメニューに食べたい食事があった場合はordermenuに追加する
                if(interestedFood.equals(food.getName())){
                    interestedFoodsInMenu.put(food, this.interestedFoodsMap.get(food.getName()));
                }
            }
            interestedFoodStr += interestedFood + ", ";
        }

        System.out.println(this.getName() + " wanted to eat " + interestedFoodStr.substring(0, interestedFoodStr.length() - 2) + ".");
        return interestedFoodsInMenu;
    }


    public Invoice Order(Restaurant r){
        Map<FoodItem, Integer> orderMenu = this.interestedCategories(r);
        String orderMenuStr = "";
        int price = 0;
        int minutes = 0;
        int orderNum = 0;
        Employee[] employees = r.getEmployees();
        int casherIndex = 0;


        for(FoodItem food : orderMenu.keySet()){
            orderNum = this.interestedFoodsMap.get(food.getName());
            orderMenuStr += food.getName() + " x " + orderNum;
            price += food.getPrice() * orderNum;
            minutes += food.getMinutes() * orderNum;
        }

        System.out.println(this.getName() + "was looking at the menu, and ordered " + orderMenuStr + ".");

        for(int i = 0; i < employees.length; i++){
            if(employees[i] instanceof Casher){
                casherIndex = i;
                break;
            }
        }

        FoodOrder foodOrder = ((Casher)employees[casherIndex]).generateOrder(r,orderMenu,price,minutes);
        Invoice invoice = ((Casher)employees[casherIndex]).generateInvoice(foodOrder);
        return invoice;
    }
}
