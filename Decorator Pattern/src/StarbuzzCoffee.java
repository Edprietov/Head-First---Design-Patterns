import Beverages.Beverage;
import Beverages.DarkRoast;
import Beverages.Decaf;
import Beverages.Espresso;
import Beverages.HouseBlend;
import Condiments.Mocha;
import Condiments.Soy;
import Condiments.SteamedMilk;
import Condiments.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
            + " $" + beverage.cost());

        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
            + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
            + " $" + beverage3.cost());

        Beverage beverage4 = new HouseBlend();
        beverage4 = new Soy(beverage4);
        beverage4 = new Mocha(beverage4);
        beverage4 = new Mocha(beverage4);
        beverage4 = new Whip(beverage4);
        System.out.println(beverage4.getDescription()
            + " $" + beverage4.cost());

        Beverage beverage5 = new Decaf();
        beverage5 = new Soy(beverage5);
        System.out.println(beverage5.getDescription()
            + " $" + beverage5.cost());

        Beverage beverage6 = new Espresso(Beverage.Size.GRANDE);
        beverage6 = new SteamedMilk(beverage6);
        System.out.println(beverage6.getDescription()
            + " $" + beverage6.cost());
    }
}