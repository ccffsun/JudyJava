package ood;

public class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("Swim!!!");
    }

    public void display(){
        System.out.println("Display!!!");
    }

    public  void performFly(){
        flyBehavior.fly();
    }

    public  void performQuack(){
        quackBehavior.quack();
    }
}


