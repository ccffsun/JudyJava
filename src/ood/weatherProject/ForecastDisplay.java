package ood.weatherProject;

public class ForecastDisplay {
    public void update(float temperature,float humidity,float pressure){
        //update program ...
        System.out.println("Updating forecast");
        System.out.printf("***Temperature:%.2f***Humidity:%.2f***Pressure:%.2f***\n", temperature, humidity, pressure);
        display();
    }

    public void display(){
        System.out.println("Displaying forecast");
        System.out.println("===================");
    }
}