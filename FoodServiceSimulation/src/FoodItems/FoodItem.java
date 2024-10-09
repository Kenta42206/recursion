package src.FoodItems;

public abstract class FoodItem {
    private String name;
    private String description;
    private int price;
    private int minutes;

    public FoodItem(String name, String description, int price, int minutes){
        this.name = name;
        this.description = description;
        this.price = price;
        this.minutes = minutes;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public int getPrice(){
        return this.price;
    }

    public int getMinutes(){
        return this.minutes;
    }


    
}
