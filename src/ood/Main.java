package ood;

public class Main {
    public static void main(String []args){
        System.out.println("Hello World ");
        System.out.println("This is duck: ");
        Duck duck =new Duck();
        duck.swim();
        duck.display();

        System.out.println("This is Mallard Duck: ");
        MallardDuck md = new MallardDuck();
        md.swim();
        md.display();
        md.performQuack();
        md.performFly();


        System.out.println("This is Read Head Duck: ");
        RedHeadDuck rd = new RedHeadDuck();
        rd.display();
        rd.performQuack();
        rd.swim();
        rd.performFly();

        System.out.println("This is Rubber Duck: ");
        RubberDuck rud = new RubberDuck();
        rud.display();
        rud.performQuack();
        rud.performFly();
        rud.swim();



        System.out.println("This is Decoy Duck: ");
        DecoyDuck dd = new DecoyDuck();
        dd.display();
        dd.swim();
        dd.performFly();
        dd.performQuack();


    }
}
