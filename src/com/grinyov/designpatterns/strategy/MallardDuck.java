package com.grinyov.designpatterns.strategy;

/**
 * Created by green on 10/30/15.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {

        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();

    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
