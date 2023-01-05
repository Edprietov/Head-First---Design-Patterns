package Condiments;

import Beverages.Beverage;

public class SteamedMilk extends CondimentDecorator {
    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    public double cost() {
        switch (getSize()) {
        case TALL:
            return .5 + beverage.cost();
        case GRANDE:
            return .10 + beverage.cost();
        case VENTI:
            return .15 + beverage.cost();
        default:
            return 0;
        }
    }
}

