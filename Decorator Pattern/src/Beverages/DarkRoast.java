package Beverages;

public class DarkRoast extends Beverage {
    public DarkRoast(Beverage.Size size) {
        description = "Dark Roast Coffee";
        setSize(size);
    }
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        switch (getSize()) {
            case TALL:
                return .99;
            case GRANDE:
                return 1.04;
            case VENTI:
                return 1.09;
            default:
                return 0;
        }
    }
}
