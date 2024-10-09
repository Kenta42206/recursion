package src.Restaurants;

import src.FoodItems.FoodItem;
import src.Persons.Employees.Employee;

public class Restaurant {
   private FoodItem[] menu; 
   private Employee[] employees;

   public Restaurant(FoodItem[] menu, Employee[] employees){
      this.menu = menu;
      this.employees = employees;
   }

   public FoodItem[] getMenu(){
    return this.menu;
   }

   public Employee[] getEmployees(){
    return this.employees;
   }
   
}
