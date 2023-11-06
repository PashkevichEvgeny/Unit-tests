package Seminar4.weather;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherReporterTest {

    /**
    Задание 4.3.
    Предположим, у вас есть класс WeatherService, который имеет метод getCurrentTemperature(),
    обращающийся к внешнему API для получения информации о текущей температуре.
    Вам нужно протестировать другой класс, WeatherReporter, который использует WeatherService.
    Создайте мок-объект для WeatherService с использованием Mockito.
    */

    @Test
    void weatherReporterTest(){
        WeatherService weatherService = mock(WeatherService.class);
        when(weatherService.getCurrentTemperature()).thenReturn(22);
        WeatherReporter weatherReporter = new WeatherReporter(weatherService);
        String result = weatherReporter.generateReport();
        assertEquals(result, "Текущая температура: 22 градусов.");
    }

}