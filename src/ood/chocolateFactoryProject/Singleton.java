package ood.chocolateFactoryProject;

public class Singleton {

    //1. make Singleton getInstance() synchronized ---- may degrade the performance
    private static Singleton uniqueInstance;

    private Singleton() {}
    //other instance var
    public static synchronized Singleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    //other methods

    /*
    2.eagerly --- just to make sure the thread safe
    private static Singleton uniqueInstance = new Singleton();
    private Singleton() {}
    public static Singleton getInstance(){
           return uniqueInstance;
           }

    3.double-checked locking
    private volatile* static Singleton uniqueInstance;

    private Singleton() {}
    //other instance var
    public static synchronized Singleton getInstance() {
        if(uniqueInstance == null) {
          synchronized (Singleton.class) {
              if(uniqueInstance == null) {
                 uniqueInstance = new Singleton();
                 }
           }
       }
        return uniqueInstance;
    }
     */

}
