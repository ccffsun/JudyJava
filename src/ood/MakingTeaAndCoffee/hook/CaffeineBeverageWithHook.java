package ood.MakingTeaAndCoffee.hook;

public abstract class CaffeineBeverageWithHook {
    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }

    }

    abstract void brew();
    abstract void addCondiments();

    final void boilWater(){
        System.out.println("Boiling water");
    }

    final void pourInCup(){
        System.out.println("pouring into cup");
    }

    boolean customerWantsCondiments(){
        return true;
    }
}
