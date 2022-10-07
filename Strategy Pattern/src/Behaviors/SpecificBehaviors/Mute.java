package Behaviors.SpecificBehaviors;

import Behaviors.GeneralBehaviors.QuackBehavior;

public class Mute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("zzzz no sound emitted.");
    }

}
