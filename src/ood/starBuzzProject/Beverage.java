package ood.starBuzzProject;

public abstract class Beverage {     //抽象类不能new
    protected String description;
    boolean milk;
    boolean mocha;



    public String getDescription(){
        return description;
    }

    public double cost(){
        double value=0;
        if(hasMilk()){
            value=value+0.1;
        }

        if(hasMocha()){
            value=value+0.2;
        }
        return value;
    }

    public void setMilk(){
        this.milk=true;
    }

    public boolean hasMilk(){
        return milk;
    }

    public void setMocha(){
        this.mocha=true;
    }

    public boolean hasMocha(){
        return mocha;
    }

}
