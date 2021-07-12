package by.milavitsky.homework.service;

import by.milavitsky.homework.entity.AbstractPlane;

import java.util.Comparator;

 class WeightSort implements Comparator<AbstractPlane> {
     @Override
     public int compare(AbstractPlane o1, AbstractPlane o2) {
         return o1.getWeight() - o2.getWeight();
     }
 }
