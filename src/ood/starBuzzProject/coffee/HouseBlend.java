package ood.starBuzzProject.coffee;

import ood.starBuzzProject.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        this.description="Most excellent House Blend";

    }

    @Override
    public double cost() {
        return 0.89;
    }
}
