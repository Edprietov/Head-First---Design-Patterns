package Condiments;

import Beverages.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
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

