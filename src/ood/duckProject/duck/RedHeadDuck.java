package ood.duckProject.duck;

import ood.duckProject.fly.FlyWithWings;
import ood.duckProject.quack.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck(){
        flyBehavior=new FlyWithWings();
        quackBehavior=new Quack();
    }
    /*
    @Override
    public void fly() {
        System.out.println("Fly!!!");
    }

    @Override
    public void quack() {
        System.out.println("Quack!!!");
    }

     */

    @Override
    public void display() {
        System.out.println("Read head duck display!!!");
    }
}
