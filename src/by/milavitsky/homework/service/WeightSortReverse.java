package by.milavitsky.homework.service;

import by.milavitsky.homework.entity.AbstractPlane;

import java.util.Comparator;

 class WeightSortReverse implements Comparator<AbstractPlane> {
     @Override
     public int compare(AbstractPlane o1, AbstractPlane o2) {
         return new WeightSort().reversed().compare(o1, o2);
     }
 }
