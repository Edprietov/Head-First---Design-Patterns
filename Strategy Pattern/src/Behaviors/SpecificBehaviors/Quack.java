package Behaviors.SpecificBehaviors;

import Behaviors.GeneralBehaviors.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack(){
        System.out.println("Quack quack .. ");
    }
}
