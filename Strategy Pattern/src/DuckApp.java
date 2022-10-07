import Behaviors.SpecificBehaviors.NoFlyAtAll;
import SpecificAnimals.MallardDuck;
import SpecificAnimals.RubberDuck;

public class DuckApp {
    public static void main(String[] args) {

        NoFlyAtAll noFlyAtAll = new NoFlyAtAll();

        RubberDuck rubberDuck = new RubberDuck("Lucas", "Black");
        rubberDuck.display();
        MallardDuck mallardDuck = new MallardDuck("Patrick", "Yellow");
        mallardDuck.display();
        mallardDuck.setFlyBehavior(noFlyAtAll);
        mallardDuck.display();

    }
}