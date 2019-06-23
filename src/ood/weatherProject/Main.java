package ood.weatherProject;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        WeatherData wd = new WeatherData();
        CurrentConditionDisplay ccd = new CurrentConditionDisplay();
        StatisticsDisplay sd = new StatisticsDisplay();
        ForecastDisplay fd = new ForecastDisplay();
        wd.registerObserver(ccd);
        wd.registerObserver(sd);
        wd.registerObserver(fd);


        TimeUnit.SECONDS.sleep(2);
        wd.setMeasurements(3.14, 5.34, 5.88);

        TimeUnit.SECONDS.sleep(5);
        wd.setMeasurements(4.23, 5.77, 5.43);

        TimeUnit.SECONDS.sleep(5);
        wd.setMeasurements(-100, -233, -5000);

    }
}
