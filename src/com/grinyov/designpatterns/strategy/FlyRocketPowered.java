package com.grinyov.designpatterns.strategy;

/**
 * Created by green on 10/30/15.
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
