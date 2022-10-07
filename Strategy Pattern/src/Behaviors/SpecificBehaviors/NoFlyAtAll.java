package Behaviors.SpecificBehaviors;

import Behaviors.GeneralBehaviors.FlyBehavior;

public class NoFlyAtAll implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am a duck that doesn't fly");
    }

}
