package org.gowtham;

import org.gowtham.behaviors.*;
import org.gowtham.parents.Duck;
import org.gowtham.subclasses.*;

public class Main
{
    public static void main(String[] args)
    {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();

        /* Dynamically setting the Duck behavior */
        model.setFlyBehavior(new FlyRocketPowered());
        model.setQuackBehavior(new MuteQuack());
        model.performFly();
        model.performQuack();
    }
}