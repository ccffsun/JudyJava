package ood.pizzaProject;

public class SimplePizzaFactory {
    public Pizza creatPizza(String type){
        Pizza p = null;
        if (type.equals("cheese")) {
            p = new CheesePizza();
        } else if (type.equals("greek")) {
            p = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            p = new PepperoniPizza();
        }
        return p;
    }
}
