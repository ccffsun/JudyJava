package ood.chocolateFactoryProject;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    //declare a private and static parameter ---- uniqueInstance , reference type is ChocolateBoiler.
    private static ChocolateBoiler uniqueInstance;
    //next, the constructor which is private and can be called only by ... in this class.
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }
    //the getInstance method is used to call the private constructor in this class and instantiation control.
    public static ChocolateBoiler getInstance() {
        if( uniqueInstance == null ) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }
    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
            //fill the chocolate and milk mixture
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()) {
            //drain the mixture
            empty = true;
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()) {
           //boil the mixture
           boiled = true;
        }
    }

    public  boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
