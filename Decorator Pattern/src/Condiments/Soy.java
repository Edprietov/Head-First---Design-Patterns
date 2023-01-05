package Condiments;

import Beverages.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        switch (getSize()) {
        case TALL:
            return .10 + beverage.cost();
        case GRANDE:
            return .15 + beverage.cost();
        case VENTI:
            return .20 + beverage.cost();
        default:
            return 0;
        }
    }
}
