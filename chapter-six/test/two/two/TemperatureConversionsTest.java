package two.two;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    TemperatureConversions temperatureConversions;

    @BeforeEach
    void setUp() {
        temperatureConversions = new TemperatureConversions();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCelsius() {
        assertEquals(15.56, temperatureConversions.celsius(60.00));
    }

    @Test
    void testFahrenheit() {
        assertEquals(60.01, temperatureConversions.fahrenheit(15.56));
    }
}