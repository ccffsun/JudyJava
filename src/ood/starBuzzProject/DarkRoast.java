package ood.starBuzzProject;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        this.description="Most excellent Dark Roast";
    }
    @Override
    public double cost() {
        return 0.99;
    }
}
