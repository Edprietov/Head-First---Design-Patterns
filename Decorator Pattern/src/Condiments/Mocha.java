package Condiments;

import Beverages.Beverage;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        switch (getSize()) {
        case TALL:
            return .15 + beverage.cost();
        case GRANDE:
            return .20 + beverage.cost();
        case VENTI:
            return .25 + beverage.cost();
        default:
            return 0;
        }
    }
}