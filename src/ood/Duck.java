package ood;

public class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("Swim!!!");
    }

    public void display() {
        System.out.println("Display!!!");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}


