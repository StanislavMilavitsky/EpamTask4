package by.milavitsky.homework.service;

import by.milavitsky.homework.entity.AbstractPlane;

import java.util.Comparator;

 class EnginePowerSort implements Comparator<AbstractPlane> {

    @Override
    public int compare(AbstractPlane o1, AbstractPlane o2) {
        return o1.getEnginePower() - o2.getEnginePower();
    }
}
