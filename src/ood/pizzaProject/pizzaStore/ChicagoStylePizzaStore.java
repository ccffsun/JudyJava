package ood.pizzaProject.pizzaStore;

import ood.pizzaProject.pizza.ChicagoStyleCheesePizza;
import ood.pizzaProject.pizza.ChicagoStyleVeggiePizza;
import ood.pizzaProject.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    public Pizza creatPizza(String type) {
        Pizza p = null;
        if (type.equals("Cheese")) {
            p = new ChicagoStyleCheesePizza();
        } else if (type.equals("Veggie")) {
            p = new ChicagoStyleVeggiePizza();
        }
        return p;
    }
}

