package ood.pizzaProject2.pizza;

import ood.pizzaProject2.pizza.ingredient.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    /*
    NYPizzaIngredientFactory override the interface PizzaIngredientFactory which means the NYPizza factory already
    decide what ingredient it needs. Later we just make CheesePizza,ClamPizza,VeggiesPizza,PepperoniPizza (which
    extends from Pizza) to make different ingredient taste.(argument in PizzaIngredientFactory (eg. NYPizzaIngredient-
    Factory) will know dough= new ?, sauce=new ?, cheese=new ?, clam=new ?.
     */
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce(){
        return new MarinaraSauce();
    }

    public Cheese createCheese(){
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies(){
        Veggies veggies[]={new Garlic(), new Onion() };
        return veggies;
    }

    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }

    public Clams createClam(){
        return new FreshClams();
    }
}
