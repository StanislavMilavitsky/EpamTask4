package by.milavitsky.homework.service;

import by.milavitsky.homework.entity.AbstractPlane;

import java.util.Comparator;

public class MaxSpeedWeightLiftingCapacitySort implements Comparator<AbstractPlane> {
    @Override
    public int compare(AbstractPlane o1, AbstractPlane o2) {
        int value1 = o1.getMaxSpeed() - (o2.getMaxSpeed());
        if (value1 == 0) {
            int value2 = o1.getWeight() - o2.getWeight();
            if(value2 == 0) {
                return o1.getLiftingCapacity() - o2.getLiftingCapacity();
            } else {
                return value2;
            }
        }
        return value1;
    }
}
