package ood;

public class Main {
    public static void main(String []args){
        System.out.println("Hello World ");
        System.out.println("This is duck: ");
        Duck duck =new Duck();
        duck.quack();
        duck.swim();
        duck.display();
        duck.fly();

        System.out.println("This is Mallard Duck: ");
        MallardDuck md = new MallardDuck();
        md.quack();
        md.swim();
        md.display();
        md.fly();

        System.out.println("This is Read Head Duck: ");
        RedHeadDuck rd = new RedHeadDuck();
        rd.quack();
        rd.swim();
        rd.display();
        rd.fly();

        System.out.println("This is Rubber Duck: ");
        RubberDuck rud = new RubberDuck();
        rud.quack();
        rud.swim();
        rud.display();
        rud.fly();

        System.out.println("This is Decoy Duck: ");
        DecoyDuck dd = new DecoyDuck();
        dd.quack();
        dd.swim();
        dd.display();
        dd.fly();
    }
}
