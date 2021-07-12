package by.milavitsky.homework.service;

import by.milavitsky.homework.entity.AbstractPlane;

import java.util.Comparator;

 class FuelConsumptionSortReverse implements Comparator<AbstractPlane> {
    @Override
    public int compare(AbstractPlane o1, AbstractPlane o2) {
        return new FuelConsumptionSort().reversed().compare(o1, o2);
    }
}
