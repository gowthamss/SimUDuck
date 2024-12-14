package org.gowtham.behaviors;

import org.gowtham.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior
{
    @Override
    public void fly()
    {
        System.out.println("I'm flying!!");
    }
}
