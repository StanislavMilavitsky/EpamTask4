package by.milavitsky.homework.service;

import static by.milavitsky.homework.entity.AirLine.*;

import by.milavitsky.homework.entity.AbstractPlane;
import by.milavitsky.homework.entity.CivilianPlane;
import by.milavitsky.homework.entity.WarPlane;
import by.milavitsky.homework.enums.CivilianPlaneType;
import by.milavitsky.homework.enums.SortType;
import by.milavitsky.homework.enums.WarPlaneType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneServiceTest {

    @Before
    public void setUp() throws Exception {
        airLine.add(new CivilianPlane(CivilianPlaneType.AIRBUS, "S440"));
        airLine.add(new WarPlane(WarPlaneType.SU, "K21"));
        airLine.getPlane(0).setLiftingCapacity(200);
        airLine.getPlane(1).setLiftingCapacity(250);
        airLine.getPlane(0).setCapacityOfPassengers(300);
        airLine.getPlane(1).setCapacityOfPassengers(15);
        airLine.getPlane(0).setTankCapacity(500);
        airLine.getPlane(1).setTankCapacity(150);

    }

    @After
    public void tearDown() throws Exception {
        airLine.removeAll();
    }

    @Test
    public void testCarryingCapacityAllPlanesPositive() {
        int actual = PlaneService.carryingCapacityAllPlanes();
        int expected = 450;
        assertEquals(expected, actual);
    }

    @Test
    public void testCarryingCapacityAllPlanesNegative() {
        int actual = PlaneService.carryingCapacityAllPlanes();
        int expected = 400;
        assertNotEquals(expected, actual);
    }

    @Test
    public void testCapacityOfpassengersPositive() {
        int actual = PlaneService.capacityOfpassengers();
        int expected = 315;
        assertEquals(expected, actual);
    }

    @Test
    public void testCapacityOfpassengersNegative() {
        int actual = PlaneService.capacityOfpassengers();
        int expected = 300;
        assertNotEquals(expected, actual);
    }


    @Test
    public void testTankCapacityPositive() {
        int actual = PlaneService.tankCapacity();
        int expected = 650;
        assertEquals(expected, actual);
    }

    @Test
    public void testTankCapacityNegative() {
        int actual = PlaneService.tankCapacity();
        int expected = 600;
        assertNotEquals(expected, actual);
    }

    @Test
    public void testSortAirLinePositive() {
        PlaneService.sortAirLine(SortType.CAPACITY_OF_PASSENGERS);
        AbstractPlane actual = airLine.getPlane(0);
        AbstractPlane expected = new WarPlane(WarPlaneType.SU, "K21");
        assertEquals(expected, actual);

    }
}