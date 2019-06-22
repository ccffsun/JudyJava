package ood.weatherProject;

public class CurrentConditionDisplay {
    public void update(float temperature ,float humidity,float pressure){
        System.out.println("Updating current condition");
        System.out.printf(">>>Temperature:%.2f>>>Humidity:%.2f>>>Pressure:%.2f>>>\n", temperature, humidity, pressure);
        display();
    }

    public void display(){
        System.out.println("Display current condition");
        System.out.println("===================");
    }
}
