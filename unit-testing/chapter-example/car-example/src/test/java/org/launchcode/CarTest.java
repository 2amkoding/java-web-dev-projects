package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    //TODO: constructor sets gasTankLevel properly
    Car test_car;
    @BeforeEach
    public void createTestCarObject(){
        test_car = new Car ("bmw", "M2",30, 20);
    }

    @Test
    public void testInitialGasTank() {
        assertEquals(50, test_car.getGasTankLevel(), .001);
    }
    @Test
    public void testInitialGasTank0() {
        assertFalse(test_car.getGasTankLevel() <= 0);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void getTankLevel(){
        test_car.drive(50);
        assertTrue(test_car.getGasTankLevel() >= 27);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range

    //TODO: can't have more gas than tank size, expect an exception
    @Test
    public void GasOverFill(){
        assertThrows(IllegalArgumentException.class, () -> test_car.addGas(5), "Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }
}