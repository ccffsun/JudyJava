package ood.pizzaProject;

public class PizzaStore {
    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory f){
        factory=f;
    }
    public Pizza orderPizza(String type) {
        Pizza p=null;
        p=factory.creatPizza(type);
        p.prepare();
        p.bake();
        p.cut();
        p.box();
        return p;
    }
}
