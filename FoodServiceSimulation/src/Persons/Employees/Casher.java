package src.Persons.Employees;

import java.util.Map;

import src.FoodItems.FoodItem;
import src.FoodOrders.FoodOrder;
import src.Invoices.Invoice;
import src.Restaurants.Restaurant;

public class Casher extends Employee{

    public Casher(String name, int age, String address, int salary, int employeeId) {
        super(name, age, address, salary, employeeId);
    }

    public FoodOrder generateOrder(Restaurant r, Map<FoodItem, Integer> orderMenu, int price, int minutes){
        System.out.println(this.getName() + " received the order.");
        Employee[] employees = r.getEmployees();


        FoodOrder foodOrder = new FoodOrder(price, minutes, orderMenu);

        for(Employee employee : employees){
            if(employee instanceof Chef){
                ((Chef)employee).prepareFood(foodOrder);
                break;
            }
        }

        return foodOrder;
    }

    public Invoice generateInvoice(FoodOrder fo){
        System.out.println(this.getName() + " made the invoice.");
        return new Invoice(fo.getTotalPrice(), fo.getTotalMinutes());
    }
    
}
