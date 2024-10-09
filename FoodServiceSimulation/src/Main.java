package src;

import java.util.Map;
import java.util.HashMap;

import src.FoodItems.FoodItem;
import src.FoodItems.HawaiianPizza;
import src.Invoices.Invoice;
import src.Persons.Customer;
import src.Persons.Employees.Casher;
import src.Persons.Employees.Chef;
import src.Persons.Employees.Employee;
import src.Restaurants.Restaurant;

public class Main{
    public static void main(String[] args) {
        FoodItem hawaiianPizza = new HawaiianPizza();

        Employee takeshi = new Casher("takeshi", 20, "Tokyo", 0, 0);
        Employee unza = new Chef("unza", 20, "Tokyo", 0, 0);
        FoodItem[] menu = {hawaiianPizza};
        Employee[] employees = {takeshi, unza};
        
        Restaurant saize = new Restaurant(menu, employees);

        // Map<String, Integer> interestedFoodsMap = new HashMap<>();
        Map<String, Integer> interestedFoodsMap = new HashMap<String, Integer>() {
            {
                put("Hawaiian Pizza", 2);
                put("two", 3);
                put("three", 4);
            }
        };

        Customer tom = new Customer("Tom", 10, "Tokyo", interestedFoodsMap);

        Invoice invoice = tom.Order(saize);
        invoice.printInvoice();
    }
}