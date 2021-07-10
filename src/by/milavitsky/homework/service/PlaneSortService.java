package by.milavitsky.homework.service;

import by.milavitsky.homework.entity.AbstractPlane;
import by.milavitsky.homework.enums.EnumSort;

import static by.milavitsky.homework.entity.AirLine.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class PlaneSortService {
   private static final HashMap<EnumSort, Comparator<Integer>> map = new HashMap<EnumSort, Comparator<Integer>>();

   public ArrayList<AbstractPlane> sortAirLine(EnumSort enumSort){
    ArrayList<AbstractPlane> list = airLine.getListPlane();
    list.sort(enumSort);
   }

}
