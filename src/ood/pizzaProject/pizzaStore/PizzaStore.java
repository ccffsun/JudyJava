package ood.pizzaProject.pizzaStore;

import ood.pizzaProject.pizza.Pizza;

public abstract class  PizzaStore {


    public Pizza orderPizza(String type) {
        Pizza pizza=null;
        pizza=creatPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    public abstract Pizza creatPizza(String type);
}
