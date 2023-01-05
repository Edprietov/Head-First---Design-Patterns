package Beverages;

public class Espresso extends Beverage {

    public Espresso(Beverage.Size size) {
        description = "Espresso";
        setSize(size);
    }
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        switch(getSize()){
        case TALL:
            return 1.99;
        case GRANDE:
            return 2.04;
        case VENTI:
            return 2.09;
        default:
            return 0;
        }
    }
}
