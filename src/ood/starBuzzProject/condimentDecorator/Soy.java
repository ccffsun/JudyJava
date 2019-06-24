package ood.starBuzzProject.condimentDecorator;

import ood.starBuzzProject.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage b){
        beverage=b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.15;
    }
}
