import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class WeatherServiceTest {

    @Test
    public void testFetchWeather() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getWeather()).thenReturn("Sunny");

        WeatherService service = new WeatherService(mockApi);

        String result = service.fetchWeather();

        assertEquals("Sunny", result);
    }
}