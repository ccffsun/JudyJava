package ood.pizzaProject2.pizza;

import ood.pizzaProject.pizza.Pizza;

public abstract class PizzaStore {


    public Pizza orderPizza(String type) {
        Pizza pizza=null;
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    public abstract ood.pizzaProject2.pizza.Pizza createPizza(String type);
}
