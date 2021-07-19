package by.milavitsky.homework.service;

import by.milavitsky.homework.entity.AbstractPlane;
import by.milavitsky.homework.entity.CivilianPlane;
import by.milavitsky.homework.entity.WarPlane;
import by.milavitsky.homework.enums.CivilianPlaneType;
import by.milavitsky.homework.enums.WarPlaneType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static by.milavitsky.homework.entity.AirLine.airLine;
import static org.junit.Assert.*;

public class AirLineServiceTest {

    @Before
    public void setUp() throws Exception {
        airLine.add(new CivilianPlane(CivilianPlaneType.AIRBUS, "S440"));
        airLine.add(new WarPlane(WarPlaneType.SU, "K21"));
        airLine.getPlane(0).setFuelСonsumption(100);
        airLine.getPlane(1).setFuelСonsumption(120);

    }

    @After
    public void tearDown() throws Exception {
        airLine.removeAll();
    }

    @Test
    public void testSearchRangeFuelСonsumptionPositive() {
        ArrayList<AbstractPlane> actual = AirLineService.searchRangeFuelСonsumption(110,120);
        ArrayList <AbstractPlane> expected = new ArrayList<AbstractPlane>();
        expected.add(new WarPlane(WarPlaneType.SU, "K21"));
        assertEquals(expected, actual);
    }

    @Test
    public void testSearchRangeFuelСonsumptionNegative() {
        ArrayList<AbstractPlane> actual = AirLineService.searchRangeFuelСonsumption(110,120);
        ArrayList <AbstractPlane> expected = new ArrayList<AbstractPlane>();
        expected.add(new WarPlane(WarPlaneType.TU, "K21"));
        assertNotEquals(expected, actual);
    }
}