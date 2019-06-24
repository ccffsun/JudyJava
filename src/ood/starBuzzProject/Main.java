package ood.starBuzzProject;

public class Main {
    public static void main(String[] args) {
        Beverage b = new HouseBlend();
        printReceipt(b);
        b.setMilk();
        printReceipt(b);
        b.setMocha();
        printReceipt(b);

        /*b = new Espresso();
        printReceipt(b);
        b = new DarkRoast();
        printReceipt(b);
        b = new Decaf();
        printReceipt(b);

         */

    }

    public static void printReceipt(Beverage b) {
        System.out.println(b.getDescription());
        System.out.println(b.cost());
    }
}
