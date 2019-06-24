package ood.weatherProject.subject;

import ood.weatherProject.observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observerList;

    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        observerList=new ArrayList<>();
    }


    public void registerObserver(Observer o) {
        this.observerList.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observerList.indexOf(o);
        if (i >= 0) {
            this.observerList.remove(o);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update(temperature, humidity, pressure);
        }
    }

    private void setTemperature(double value) {
        this.temperature = value;
    }

    private double getTemperature() {
        return this.temperature;
    }

    private void setHumidity(double value) {
        this.humidity = value;

    }

    private double getHumidity() {
        return this.humidity;
    }

    private void setPressure(double value) {
        this.pressure = value;
    }

    private double getPressure() {
        return this.pressure;
    }

    public void measurementsChanged() {
        this.temperature = getTemperature();
        this.humidity = getHumidity();
        this.pressure = getPressure();
        this.notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);
        this.measurementsChanged();
    }
}
