package ood.pizzaProject2.pizza;

public abstract class PizzaStore {


    public Pizza orderPizza(String type) {
        ood.pizzaProject2.pizza.Pizza pizza=null;
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    public abstract ood.pizzaProject2.pizza.Pizza createPizza(String type);
}
