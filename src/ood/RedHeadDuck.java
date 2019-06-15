package ood;

public class RedHeadDuck extends Duck implements Flyable,Quackable{
    @Override
    public void fly() {
        System.out.println("Fly!!!");
    }

    @Override
    public void quack() {
        System.out.println("Quack!!!");
    }

    @Override
    public void display() {
        System.out.println("Read head duck display!!!");
    }
}
