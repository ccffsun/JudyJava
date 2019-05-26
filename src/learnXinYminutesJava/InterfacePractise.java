package learnXinYminutesJava;

public interface InterfacePractise {
    void move();
}

interface Edible {
    void eat();
}

interface Digestible {
    public void digestible();

    public default void defaultMethod() {
        System.out.println("Hi from default method...");
    }
}

class Fruit implements Edible,Digestible {
    @Override
    public void eat() {

    }

    @Override
    public void digestible() {

    }
}

