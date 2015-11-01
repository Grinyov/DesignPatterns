package com.grinyov.designpatterns.strategy;

/**
 * Created by green on 10/30/15.
 */
public class Squeak implements QuackBehavior{
    public void quack() {
        System.out.println("Squeak");
    }
}
