package com.grinyov.designpatterns.strategy;

/**
 * Created by green on 10/30/15.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck	mallard = new MallardDuck();
        RubberDuck	rubberDuckie = new RubberDuck();
        DecoyDuck	decoy = new DecoyDuck();

        ModelDuck	model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
