package by.milavitsky.homework.service;

import by.milavitsky.homework.entity.AbstractPlane;

import static by.milavitsky.homework.entity.AirLine.*;

import java.util.ArrayList;

public class PlaneCapacityService {
    private static ArrayList<AbstractPlane> listPlane = airLine.getListPlane();

    public static int carryingCapacityAllPlanes(){
        int carryingCapacity = 0;
        for (int i = 0; i < listPlane.size(); i++){
            carryingCapacity = carryingCapacity + listPlane.get(i).getLiftingCapacity();
        }
        return carryingCapacity;
    }

    public static int capacityOfpassengers(){
        int capacityPassengers = 0;
        for (int i = 0; i < listPlane.size(); i++){
            capacityPassengers = capacityPassengers + listPlane.get(i).getCapacityOfpassengers();
        }
        return capacityPassengers;
    }

    public static int tankCapacity(){
        int tankCapacitys = 0;
        for (int i = 0; i < listPlane.size(); i++){
            tankCapacitys = tankCapacitys + listPlane.get(i).getTankCapacity();
        }
        return tankCapacitys;
    }



}
