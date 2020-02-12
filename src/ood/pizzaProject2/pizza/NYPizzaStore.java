package ood.pizzaProject2.pizza;

import ood.pizzaProject2.pizza.*;

/*
import ood.pizzaProject2.pizza is important. Here Pizza is different from the pizza in project1
also the "Pizza pizza" is different and so as "return pizza". Intellij will give you the tips if there
is something wrong.
 */

public class NYPizzaStore extends PizzaStore {

        public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        /*
        else if(item.equals("veggie")){
            pizza = new VeggiesPizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        ....the same as "clam" and "pepperoni" pizza.
         */
         return pizza;
        }

}
