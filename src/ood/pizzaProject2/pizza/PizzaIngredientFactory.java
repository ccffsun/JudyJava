package ood.pizzaProject2.pizza;

import ood.pizzaProject2.pizza.ingredient.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public  Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
