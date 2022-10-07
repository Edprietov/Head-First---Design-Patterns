package SpecificAnimals;

import AnimalsTypes.Duck;
import Behaviors.SpecificBehaviors.FLyWithWIngs;
import Behaviors.SpecificBehaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(String name, String color){
        this.setName(name);
        this.setColor(color);
        quackBehavior = new Quack();
        flyBehavior = new FLyWithWIngs();
    }
    @Override
    public void display() {
        System.out.println("I'm " + getName() + " my skin is " + getColor() + " and I'm a " + this.getClass().getSimpleName());
        System.out.print("Quack behavior -> " ); perfomrQuack();
        System.out.print("Fly behavior -> " ); performFly();
        System.out.println("------------------------" );
    }
}
