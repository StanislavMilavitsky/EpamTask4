package by.milavitsky.homework.main;

import static by.milavitsky.homework.entity.AirLine.*;

import by.milavitsky.homework.entity.CivilianPlane;
import by.milavitsky.homework.enums.CivilianPlaneType;
import by.milavitsky.homework.entity.WarPlane;
import by.milavitsky.homework.enums.WarPlaneType;
import by.milavitsky.homework.service.AirLineService;

public class Main {
    public static void main(String[] args) {
       /* UUID id =  UUID.randomUUID();
        System.out.println(id);*/
        CivilianPlane plane1 = new CivilianPlane(CivilianPlaneType.AIRBUS, "A330");
        CivilianPlane plane2 = new CivilianPlane(CivilianPlaneType.EMBRAER, "S440");
        CivilianPlane plane4 = new CivilianPlane(CivilianPlaneType.ATR, "K21");
        WarPlane plane3 = new WarPlane(WarPlaneType.MIG, "130");
        airLine.add(plane1);
        airLine.add(plane2);
        airLine.add(plane3);
        airLine.add(plane4);
        airLine.getPlane(3).getFuelСonsumption();
        plane1.setMaxSpeed(40);
        plane2.setMaxSpeed(20);
        plane3.setMaxSpeed(50);
        plane4.setMaxSpeed(70);
        plane1.setWeight(40);
        plane2.setWeight(40);
        plane3.setWeight(30);
        plane4.setWeight(40);
        plane1.setFuelСonsumption(50);
        plane2.setFuelСonsumption(150);
        plane3.setFuelСonsumption(149);
        plane4.setFuelСonsumption(300);
        plane1.setLiftingCapacity(41);
        plane2.setLiftingCapacity(1000);
        plane3.setLiftingCapacity(300);
        plane4.setLiftingCapacity(233);
       /* System.out.println(airLine.getListPlane());
        PlaneSortService.sortAirLine(EnumSort.MAX_SPEED__WEIGHT__LIFTING_CAPACITY);
        System.out.println(airLine.getListPlane());*/
        System.out.println(AirLineService.searchRangeFuelСonsumption(149, 200));


    }
}
