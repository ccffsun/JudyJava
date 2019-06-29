package ood.pizzaProject.pizzaStore;

import ood.pizzaProject.pizza.Pizza;

public abstract class  PizzaStore {


    public Pizza orderPizza(String type) {
        Pizza p=null;
        p=creatPizza(type);
        p.prepare();
        p.bake();
        p.cut();
        p.box();
        return p;
    }
    public abstract Pizza creatPizza(String type);
}
