package ood.pizzaProject2.pizza;

import ood.pizzaProject2.pizza.ingredient.ThinCrustDough;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory=ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing"+ name);
        /*
        if the argument " (PizzaIngredientFactory ingredientFactory)" is "NYPizzaIngredientFactory"
        then "dough = ingredientFactory.createDough() " go to "dough = new ThinCrustDough()"
        you don't need to know what " ingredientFactory.createDough " really is, just call it and NYPizzaIngredient
        factory will do it for you!
         */

        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
