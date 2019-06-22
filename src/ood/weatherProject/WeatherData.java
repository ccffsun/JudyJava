package ood.weatherProject;

public class WeatherData {
    private ForecastDisplay forecastDisplay;
    private StatisticsDisplay statisticsDisplay;
    private CurrentConditionDisplay currentConditionDisplay;

    public WeatherData() {
        forecastDisplay = new ForecastDisplay();
        statisticsDisplay = new StatisticsDisplay();
        currentConditionDisplay = new CurrentConditionDisplay();
    }

    private float getTemperature() {
        return (float) 3.14;
    }

    private float getHumidity() {
        return (float) 14.15;
    }

    private float getPressure() {
        return (float) 60.90;
    }

    public void measurementsChanged() {
        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();
        currentConditionDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }
}
