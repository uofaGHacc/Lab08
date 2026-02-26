package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist (Step 6)
        // The test should pass now after implementing hasCity() (Step 8)
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertEquals(1, list.countCities());

        City edmonton = new City("edmonton", "AB");
        list.addCity(calgary);
        assertEquals(2, list.countCities());

        list.deleteCity(calgary);
        assertEquals(1, list.countCities());

        list.deleteCity(edmonton);
        assertEquals(0, list.countCities());
    }
}
