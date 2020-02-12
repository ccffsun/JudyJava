package ood.pizzaProject2.pizza;

import ood.pizzaProject2.pizza.ingredient.*;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggie;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract  void prepare();

    void bake(){
        System.out.println("bake...");
    }

    void cut(){
        System.out.println("cut...");
    }

    void box(){
        System.out.println("box");
    }

    public void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
}
