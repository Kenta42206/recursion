package src.Persons.Employees;

import src.Persons.Person;

public abstract class Employee extends Person {
    private int salary;
    private int employeeId;

    public Employee(String name, int age, String address, int salary, int employeeId) {
        super(name, age, address);
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public int getSalary(){
        return this.salary;
    }

    public int employeeId(){
        return this.employeeId;
    }
    
}
