package ood.weatherProject.observer;

public class CurrentConditionDisplay implements Observer {
    /*
    public CurrentConditionDisplay(Subject s){
        s.registerObserver(this);
    }

     */

    public void update(double temperature ,double humidity,double pressure){
        System.out.println("Updating current condition");
        System.out.printf(">>>Temperature:%.2f>>>Humidity:%.2f>>>Pressure:%.2f>>>\n", temperature, humidity, pressure);
        display();
    }

    public void display(){
        System.out.println("Display current condition");
        System.out.println("===================");
    }
}
