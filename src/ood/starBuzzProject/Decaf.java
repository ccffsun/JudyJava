package ood.starBuzzProject;

public class Decaf extends Beverage{
    public Decaf(){
        this.description="Most excellent Decaf";
    }
    @Override
    public double cost() {
        return 1.05+super.cost();
    }
}
