package by.milavitsky.homework.service;

import by.milavitsky.homework.entity.AbstractPlane;
import by.milavitsky.homework.enums.SortType;
import by.milavitsky.homework.service.comporator.*;

import static by.milavitsky.homework.entity.AirLine.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PlaneService {
    private static final HashMap<SortType, Comparator<AbstractPlane>> map = new HashMap<SortType, Comparator<AbstractPlane>>();
    private static final ArrayList<AbstractPlane> listPlane = airLine.getListPlane();
    /**
     * Put into map key, for sort method, in value we put object of method
     */
    static {
        map.put(SortType.ENGINE_POWER, new EnginePowerSortComporator());
        map.put(SortType.LIFTING_CAPACITY, new LiftingCapacitySortComporator());
        map.put(SortType.CAPACITY_OF_PASSENGERS, new CapacityOfPassengersSortComporator());
        map.put(SortType.FUEL_CONSUMPTION, new FuelConsumptionSortComporator());
        map.put(SortType.TANK_CAPACITY, new TankCapacitySortComporator());
        map.put(SortType.MAX_SPEED, new MaxSpeedSortComporator());
        map.put(SortType.WEIGHT, new WeightSortComporator());
        map.put(SortType.ENGINE_POWER_REVERSE, new EnginePowerSortReverseComporator());
        map.put(SortType.LIFTING_CAPACITY_REVERSE, new LiftingCapacitySortReverseComporator());
        map.put(SortType.CAPACITY_OF_PASSENGERS_REVERSE, new CapacityOfPassengersSortReverseComporator());
        map.put(SortType.FUEL_CONSUMPTION_REVERSE, new FuelConsumptionSortReverseComporator());
        map.put(SortType.TANK_CAPACITY_REVERSE, new TankCapacitySortReverseComporator());
        map.put(SortType.MAX_SPEED_REVERSE, new MaxSpeedSortReverseComporator());
        map.put(SortType.WEIGHT_REVERSE, new WeightSortReverseComporator());
        map.put(SortType.PLANE_TYP_WAR, new PlaneTypWarSortComporator());
        map.put(SortType.PLANE_TYP_CIVILIAN, new PlaneTypCivilianSortComporator());
        map.put(SortType.MAX_SPEED__WEIGHT__LIFTING_CAPACITY, new MaxSpeedWeightLiftingCapacitySortComporator());
    }


    public static int carryingCapacityAllPlanes() {
        int carryingCapacity = 0;
        for (int i = 0; i < listPlane.size(); i++) {
            carryingCapacity = carryingCapacity + listPlane.get(i).getLiftingCapacity();
        }
        return carryingCapacity;
    }

    public static int capacityOfpassengers() {
        int capacityPassengers = 0;
        for (int i = 0; i < listPlane.size(); i++) {
            capacityPassengers = capacityPassengers + listPlane.get(i).getCapacityOfPassengers();
        }
        return capacityPassengers;
    }

    public static int tankCapacity() {
        int tankCapacitys = 0;
        for (int i = 0; i < listPlane.size(); i++) {
            tankCapacitys = tankCapacitys + listPlane.get(i).getTankCapacity();
        }
        return tankCapacitys;
    }

    public static void sortAirLine(SortType sortType) {
        Collections.sort(listPlane, map.get(sortType));
    }

}
