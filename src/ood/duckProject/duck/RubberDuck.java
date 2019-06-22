package ood.duckProject.duck;

import ood.duckProject.fly.FlyNoWay;
import ood.duckProject.quack.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehavior=new Squeak();
        flyBehavior=new FlyNoWay();
    }
    /*
    public void quack() {
        System.out.println("Pipipi!!!");
    }
    */
    @Override
    public void display() {
        System.out.println("RubberDuck display!!!");
    }



}
