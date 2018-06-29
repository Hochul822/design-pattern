package ch02_observer;

public class WeatherService {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 77);
        weatherData.setMeasurements(65, 88, 75);
    }
}
