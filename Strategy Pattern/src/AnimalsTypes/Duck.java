package AnimalsTypes;

import Behaviors.GeneralBehaviors.FlyBehavior;
import Behaviors.GeneralBehaviors.QuackBehavior;

public abstract class Duck {

    public FlyBehavior flyBehavior;

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public QuackBehavior quackBehavior;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public Duck(){};

    public abstract void display();
    public void performFly(){
        flyBehavior.fly();
    }

    public void perfomrQuack(){
        quackBehavior.quack();
    }

}
