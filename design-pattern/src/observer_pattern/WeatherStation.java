package observer_pattern;

import observer_pattern.data.WeatherData;
import observer_pattern.view.CurrentConditionsDisplay;

public class WeatherStation {
    private WeatherData weatherData;

    public WeatherStation() {
        this.weatherData = new WeatherData();
        new CurrentConditionsDisplay(this.weatherData);
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        station.getWeatherData().setMeasurements(80, 65, 30.4f);
    }
}