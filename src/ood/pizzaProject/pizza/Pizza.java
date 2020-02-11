package ood.pizzaProject.pizza;

import java.util.ArrayList;

public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings=new ArrayList();


    public void prepare(){
        System.out.println( "Preparing... "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        for(int i=0;i<toppings.size();i++){
            System.out.println("   "+toppings.get(i));
        }
    }
    public void bake(){
        System.out.println("Baking for 25 mins at 350F");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}
