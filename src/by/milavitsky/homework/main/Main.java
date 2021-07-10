package by.milavitsky.homework.main;

import static by.milavitsky.homework.entity.AirLine.*;

import by.milavitsky.homework.entity.CivilianPlane;
import by.milavitsky.homework.entity.CivilianPlaneType;
import by.milavitsky.homework.service.PlaneCapacityService;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
       /* UUID id =  UUID.randomUUID();
        System.out.println(id);*/
        CivilianPlane plane1 = new CivilianPlane(CivilianPlaneType.AIRBUS, "A330");
        CivilianPlane plane2 = new CivilianPlane(CivilianPlaneType.EMBRAER, "S440");
        CivilianPlane plane3 = new CivilianPlane(CivilianPlaneType.ATR, "K21");
        airLine.add(plane1);
        airLine.add(plane2);
        plane1.setLiftingCapacity(5);
        plane2.setLiftingCapacity(9);
        System.out.println(airLine.getListPlane());


    }
}
