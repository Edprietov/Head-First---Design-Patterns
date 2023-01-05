package Beverages;

public abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 0;
    }
}
