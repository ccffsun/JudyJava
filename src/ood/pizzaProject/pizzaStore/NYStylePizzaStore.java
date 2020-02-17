package ood.pizzaProject.pizzaStore;

import ood.pizzaProject.pizza.NYStyleCheesePizza;
import ood.pizzaProject.pizza.NYStyleClamPizza;
import ood.pizzaProject.pizza.NYStyleVeggiePizza;
import ood.pizzaProject.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        Pizza p = null;
        if (type.equals("Cheese")) {
            p = new NYStyleCheesePizza();
        } else if (type.equals("Veggie")) {
            p = new NYStyleVeggiePizza();
        }else if(type.equals("clam")){
            p=new NYStyleClamPizza();
        }
        return p;
    }
}
