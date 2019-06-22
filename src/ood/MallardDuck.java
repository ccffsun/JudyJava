package ood;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }


    @Override
    public void display() {
        System.out.println("Mallard Duck display!!!");
    }



/*
    public void fly() {
        System.out.println("Fly!!!");
    }

    public void quack(){
        System.out.println("Quack!!!");
    }
  */

}
