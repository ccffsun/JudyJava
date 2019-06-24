package ood.pizzaProject;

public class Pizza {
    String description;
    public void prepare(){
        System.out.println( "Preparing... "+description);
    }
    public void bake(){
        System.out.println("Baking... "+description);
    }
    public void cut(){

        System.out.println("Cutting... "+description);
    }
    public void box(){
        System.out.println("Boxing... "+description);
    }

}
