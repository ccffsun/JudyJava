package ood.MakingTeaAndCoffee;

import jdk.swing.interop.SwingInterOpUtils;
/*
Class CaffeineBeverage is a template for making caffeine beverages.
These caffeine beverages have the same steps and similar method.
This class will invoke child class's method when necessary, but child class can not invoke its parent class's method,
"Dont't call me, I'll call you later."  which avoiding the circle dependency of them both.
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        hook();

        }

    abstract void brew();
    abstract void addCondiments();

    final void boilWater(){         //final can not override by child class's method
        System.out.println("Boiling water");
    }

    final void pourInCup(){
        System.out.println("pouring into cup");
    }

    void hook(){
        // do nothing
    }
}
