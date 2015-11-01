package com.grinyov.designpatterns.strategy;

/**
 * Created by green on 10/30/15.
 */
public class MuteQuack implements QuackBehavior{
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
