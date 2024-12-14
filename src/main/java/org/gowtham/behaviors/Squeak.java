package org.gowtham.behaviors;

import org.gowtham.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior
{
    @Override public void quack()
    {
        System.out.println("I Squeak.");
    }
}
