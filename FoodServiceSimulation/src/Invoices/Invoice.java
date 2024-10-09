package src.Invoices;

import java.sql.Timestamp;
import java.util.Date;

public class Invoice {
    private int price;
    private int estimatedTimeInMinutes;
    private Timestamp orderTime;

    public Invoice(int price, int estimatedTimeInMinutes){
        this.price = price;
        this.estimatedTimeInMinutes = estimatedTimeInMinutes;
        this.orderTime = new Timestamp(new Date().getTime());
    }

    public int getPrice(){
        return this.price;
    }

    public int getEstimatedTimeInMinutes(){
        return this.estimatedTimeInMinutes;
    }

    public Timestamp getOrderTime(){
        return this.orderTime;
    }

    public void printInvoice(){
        System.out.println("---------------------");
        System.out.println("Date: " + this.orderTime);
        System.out.println("Final Price: " + this.price);
        System.out.println("---------------------");
    }
}
