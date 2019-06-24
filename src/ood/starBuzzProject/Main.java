package ood.starBuzzProject;

import ood.starBuzzProject.coffee.DarkRoast;
import ood.starBuzzProject.coffee.Decaf;
import ood.starBuzzProject.coffee.Espresso;
import ood.starBuzzProject.coffee.HouseBlend;
import ood.starBuzzProject.condimentDecorator.Milk;
import ood.starBuzzProject.condimentDecorator.Mocha;
import ood.starBuzzProject.condimentDecorator.Soy;
import ood.starBuzzProject.condimentDecorator.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage b = new HouseBlend();
        b=new Milk(b);
        b=new Mocha(b);
        printReceipt(b);

        b = new Whip(new Mocha(new Espresso()));
        printReceipt(b);

        b = new Soy(new Mocha(new Milk(new DarkRoast())));
        printReceipt(b);

        b = new Milk(new Milk(new Mocha(new Decaf())));
        printReceipt(b);
    }

    public static void printReceipt(Beverage b) {
        System.out.println(b.getDescription());
        System.out.printf("$%.2f\n",b.cost());
    }
}
