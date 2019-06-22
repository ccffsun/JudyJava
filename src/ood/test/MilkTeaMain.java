package ood.test;

public class MilkTeaMain {
    public static void main(String[]args){
        Milk m =new MilkTea();
        m.a();//milk tea a() override milk a()
        m.b();
        Milk m2 =new Milk();
        m2.a();
        m2.b();
    }

}
