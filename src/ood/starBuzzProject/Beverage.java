package ood.starBuzzProject;

public abstract class Beverage {     //抽象类不能new
    protected String description;

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
