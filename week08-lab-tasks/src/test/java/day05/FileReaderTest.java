package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void testFindSmallestTemperatureSpread() {
        int value = new FileReader().findSmallestTemperatureSpread("weather.dat");
        assertEquals(14, value);
    }

    @Test
    void testFindSmallestTeamDifference() {
        String value = new FileReader().findSmallestTeamDifference("football.dat");
        assertEquals("Aston_Villa", value);
    }
}