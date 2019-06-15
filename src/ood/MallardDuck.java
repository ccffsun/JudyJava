package ood;

public class MallardDuck extends Duck implements Flyable ,Quackable {
    @Override
    public void display() {
        System.out.println("Mallard Duck display!!!");
    }


    public void fly() {
        System.out.println("Fly!!!");
    }

    public void quack(){
        System.out.println("Quack!!!");
    }
}
