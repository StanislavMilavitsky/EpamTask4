package by.milavitsky.homework.service;

import by.milavitsky.homework.entity.AbstractPlane;
import by.milavitsky.homework.enums.EnumSort;

import static by.milavitsky.homework.entity.AirLine.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PlaneSortService {
   private static final HashMap<EnumSort, Comparator<AbstractPlane>> map = new HashMap<EnumSort, Comparator<AbstractPlane>>();

    /**
     * Put into map key, for sort method, in value we put object of method
     */
    static {
        map.put(EnumSort.ENGINE_POWER, new EnginePowerSort());
        map.put(EnumSort.LIFTING_CAPACITY, new LiftingCapacitySort());
        map.put(EnumSort.CAPACITY_OF_PASSENGERS, new CapacityOfPassengersSort());
        map.put(EnumSort.FUEL_CONSUMPTION, new FuelConsumptionSort());
        map.put(EnumSort.TANK_CAPACITY, new TankCapacitySort());
        map.put(EnumSort.MAX_SPEED, new MaxSpeedSort());
        map.put(EnumSort.WEIGHT, new WeightSort());
        map.put(EnumSort.ENGINE_POWER_REVERSE, new EnginePowerSortReverse());
        map.put(EnumSort.LIFTING_CAPACITY_REVERSE, new LiftingCapacitySortReverse());
        map.put(EnumSort.CAPACITY_OF_PASSENGERS_REVERSE, new CapacityOfPassengersSortReverse());
        map.put(EnumSort.FUEL_CONSUMPTION_REVERSE, new FuelConsumptionSortReverse());
        map.put(EnumSort.TANK_CAPACITY_REVERSE, new TankCapacitySortReverse());
        map.put(EnumSort.MAX_SPEED_REVERSE, new MaxSpeedSortReverse());
        map.put(EnumSort.WEIGHT_REVERSE, new WeightSortReverse());
        map.put(EnumSort.PLANE_TYP_WAR, new PlaneTypWarSort());
        map.put(EnumSort.PLANE_TYP_CIVILIAN, new PlaneTypCivilianSort());
        map.put(EnumSort.MAX_SPEED__WEIGHT__LIFTING_CAPACITY, new MaxSpeedWeightLiftingCapacitySort());
    }

   public static void sortAirLine(EnumSort enumSort){
    ArrayList<AbstractPlane> list = airLine.getListPlane();
       Collections.sort(list, map.get(enumSort));
   }

}
