package ood.DuckyTurkeyProject;

/*
The steps of making a adapter
1. a duck interface
2. a turkey interface
3. a class implement the duck interface (MallardDuck)
4. a class implement the turkey interface (WildTurkey)
5. make a adapter : adapter implements request -----  turkeyAdapter implements Duck
    request(class type)  translatedRequest+Adapter ----- Duck turkeyAdapter
    duck and turkey is decoupled by the adaptor
 */

public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);  // a turkey looks like a duck
        //request translatedRequest

        System.out.println("The turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();


        System.out.println("The duck says...");
        mallardDuck.quack();
        mallardDuck.fly();


        System.out.println("The turkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck) {
        /* why use this method instead of turkeyAdapter.quack() and turkeyAdapter.fly()?
           If you are not sure the turkeyAdapter is a duck or a turkey, invoke the method duck.quack() or duck.fly()
           may occur error.
         */
        duck.quack();
        duck.fly();
    }
}
