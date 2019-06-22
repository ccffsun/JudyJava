package ood.weatherProject;

public class StatisticsDisplay {
    public void update(float temperature ,float humidity,float pressure){
        System.out.println("Updating statistics");
        System.out.printf("---Temperature:%.2f---Humidity:%.2f---Pressure:%.2f---\n", temperature, humidity, pressure);
        display();
    }
    public void display(){
        System.out.println("Display statistics");
        System.out.println("===================");
    }
}
