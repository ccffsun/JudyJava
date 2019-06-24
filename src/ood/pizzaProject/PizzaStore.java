package ood.pizzaProject;

public class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza p = null;
        if (type.equals("cheese")) {
            p = new CheesePizza();
        } else if (type.equals("greek")) {
            p = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            p = new PepperoniPizza();
        }
        p.prepare();
        p.bake();
        p.cut();
        p.box();
        return p;
    }
}
