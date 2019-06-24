package ood.weatherProject.observer;

public class StatisticsDisplay implements Observer {
    /*
    public StatisticsDisplay(Subject s){
        s.registerObserver(this);
    }

     */
    public void update(double temperature ,double humidity,double pressure){
        System.out.println("Updating statistics");
        System.out.printf("---Temperature:%.2f---Humidity:%.2f---Pressure:%.2f---\n", temperature, humidity, pressure);
        display();
    }

    public void display(){
        System.out.println("Display statistics");
        System.out.println("===================");
    }
}
