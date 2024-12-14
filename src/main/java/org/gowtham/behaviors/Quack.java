package org.gowtham.behaviors;

import org.gowtham.interfaces.QuackBehavior;

public class Quack implements QuackBehavior
{
    @Override
    public void quack()
    {
        System.out.println("I quack.");
    }
}
