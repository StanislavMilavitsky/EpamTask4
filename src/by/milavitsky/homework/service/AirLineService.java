package by.milavitsky.homework.service;

import static by.milavitsky.homework.entity.AirLine.*;

import by.milavitsky.homework.entity.AbstractPlane;

import java.util.ArrayList;

public class AirLineService {

    public static ArrayList<AbstractPlane> searchRangeFuelСonsumption(int value1, int value2) {
        ArrayList<AbstractPlane> list = new ArrayList<AbstractPlane>();
        for (int i = 0; i < airLine.getSize(); i++) {
            int fuelConsuption = airLine.getPlane(i).getFuelСonsumption();
            if (fuelConsuption >= value1 & fuelConsuption <= value2) {
                list.add(airLine.getPlane(i));
            }

        }
        return list;
    }
}
