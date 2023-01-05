package Condiments;

import Beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public enum Size { TALL, GRANDE, VENTI };

    Size size;

    public void setSize(Size size) {
        this.size = size;
    }

    public void getSize(Size size){
        this.size = size;
    }

    public abstract String getDescription();

}

