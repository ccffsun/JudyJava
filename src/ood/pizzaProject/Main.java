package ood.pizzaProject;

import ood.pizzaProject.pizza.Pizza;
import ood.pizzaProject.pizzaStore.ChicagoStylePizzaStore;
import ood.pizzaProject.pizzaStore.NYStylePizzaStore;
import ood.pizzaProject.pizzaStore.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore ps = new NYStylePizzaStore();
        Pizza p = ps.orderPizza("Cheese");
        System.out.println(p.getName());
        ps=new ChicagoStylePizzaStore();
        p=ps.orderPizza("Veggie");
        System.out.println(p.getName());
    }
}
