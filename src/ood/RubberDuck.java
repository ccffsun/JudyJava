package ood;

public class RubberDuck extends Duck implements Quackable {

    public void quack() {
        System.out.println("Pipipi!!!");
    }

    @Override
    public void display() {
        System.out.println("RubberDuck display!!!");
    }



}
