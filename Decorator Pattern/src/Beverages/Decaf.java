package Beverages;

public class Decaf extends Beverage {

    public Decaf(Beverage.Size size) {
        description = "Decaf Coffee";
        setSize(size);
    }
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        switch(getSize()){
        case TALL:
            return 1.05;
        case GRANDE:
            return 1.10;
        case VENTI:
            return 1.15;
        default:
            return 0;
        }
    }

}
