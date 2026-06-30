public class WeatherService {

    private ExternalApi api;

    public WeatherService(ExternalApi api) {
        this.api = api;
    }

    public String fetchWeather() {
        return api.getWeather();
    }
}