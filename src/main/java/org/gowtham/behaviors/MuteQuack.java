package org.gowtham.behaviors;

import org.gowtham.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior
{

    @Override public void quack()
    {
        System.out.println("<< Silence >>");
    }
}
