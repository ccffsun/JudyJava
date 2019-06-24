package ood.pizzaProject;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory f=new SimplePizzaFactory();
        PizzaStore ps = new PizzaStore(f);
        Pizza p = ps.orderPizza("cheese");
        System.out.println(p.description);
    }
}
