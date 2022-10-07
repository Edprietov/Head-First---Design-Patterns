package SpecificAnimals;

import AnimalsTypes.Duck;
import Behaviors.SpecificBehaviors.Mute;
import Behaviors.SpecificBehaviors.NoFlyAtAll;

public class RubberDuck extends Duck {

    public RubberDuck(String name, String color) {
        this.setName(name);
        this.setColor(color);
        flyBehavior = new NoFlyAtAll();
        quackBehavior = new Mute();
    }

    @Override
    public void display() {
        System.out.println("I'm " + getName() + " my skin is " + getColor() + " and I'm a " + this.getClass().getSimpleName());
        System.out.print("Quack behavior -> " ); perfomrQuack();
        System.out.print("Fly behavior -> " ); performFly();
        System.out.println("------------------------" );
    }
}
