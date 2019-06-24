package ood.pizzaProject;

public class Main {
    public static void main(String[] args) {
        PizzaStore ps = new PizzaStore();
        Pizza p = ps.orderPizza("cheese");
        System.out.println(p.description);
    }
}
