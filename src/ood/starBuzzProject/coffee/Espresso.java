package ood.starBuzzProject.coffee;

import ood.starBuzzProject.Beverage;

public class Espresso extends Beverage {
    public Espresso(){
        this.description="Most excellent Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
