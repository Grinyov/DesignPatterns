package com.grinyov.designpatterns.strategy;

/**
 * Created by green on 10/30/15.
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}
