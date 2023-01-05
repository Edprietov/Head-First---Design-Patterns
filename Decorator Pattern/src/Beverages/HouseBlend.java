package Beverages;

public class HouseBlend extends Beverage {

    public HouseBlend(Beverage.Size size) {
        description = "House Blend Coffee";
        setSize(size);
    }

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        switch (getSize()) {
        case TALL:
            return .89;
        case GRANDE:
            return .94;
        case VENTI:
            return .99;
        default:
            return 0;
        }
    }
}

