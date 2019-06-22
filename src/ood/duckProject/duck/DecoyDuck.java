package ood.duckProject.duck;

import ood.duckProject.fly.FlyNoWay;
import ood.duckProject.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("Decoy Duck display!!!");
    }
}
