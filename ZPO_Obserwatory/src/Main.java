public class Main {

    public static void main(String[] args) {
	WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);

    weatherData.setMeasurements(15, 36, 1004);

        WeatherForecast forecast = new WeatherForecast(1013.25);
        PressureObserver observer = new PressureObserver();

        forecast.registerObserver(observer);

        forecast.updatePressure(1015.50);
        forecast.updatePressure(1012.00);
        forecast.updatePressure(1012.00);



        WeatherStatistics statistics = new WeatherStatistics(12);
        ObserverTemperature observerTemperature = new TemperatureObserver();

        statistics.registerObserver(observerTemperature);

        statistics.updateTemperature(36.6);
        statistics.updateTemperature(16.6);
        statistics.updateTemperature(26.6);
        statistics.updateTemperature(46.6);
        statistics.updateTemperature(56.6);
    }
}
