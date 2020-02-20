package ood.MakingTeaAndCoffee.hook;

public class BeverageTestDrive {
    public static void main(String[] args){

       CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking coffee....");
        coffeeHook.prepareRecipe();
    }
}
