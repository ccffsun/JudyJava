package ood.weatherProject;

public class WeatherData {
    private ForecastDisplay forecastDisplay;
    private StatisticsDisplay statisticsDisplay;
    private CurrentConditionDisplay currentConditionDisplay;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        forecastDisplay = new ForecastDisplay();
        statisticsDisplay = new StatisticsDisplay();
        currentConditionDisplay = new CurrentConditionDisplay();
    }

    private void setTemperature(double value){
        this.temperature = value;
    }

    private double getTemperature() {
        return this.temperature;
    }

    private void setHumidity(double value){
        this.humidity= value;

    }
    private double getHumidity() {
        return this.humidity;
    }

    private  void setPressure(double value){
        this.pressure=value;
    }
    private double getPressure() {
        return this.pressure;
    }

    public void measurementsChanged() {
        this.temperature = getTemperature();
        this.humidity = getHumidity();
        this.pressure = getPressure();
        this.currentConditionDisplay.update(temperature, humidity, pressure);
        this.statisticsDisplay.update(temperature, humidity, pressure);
        this.forecastDisplay.update(temperature, humidity, pressure);
    }

    public void setMeasurements(double temperature, double humidity, double pressure){
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);
        this.measurementsChanged();
    }
}
