package org.gowtham.subclasses;

import org.gowtham.behaviors.*;
import org.gowtham.parents.Duck;

public class MallardDuck extends Duck
{
    public MallardDuck()
    {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display()
    {
        System.out.println("I'm a real Mallard Duck");
    }
}
