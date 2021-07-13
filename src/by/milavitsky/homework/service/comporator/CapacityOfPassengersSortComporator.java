package by.milavitsky.homework.service.comporator;

import by.milavitsky.homework.entity.AbstractPlane;

import java.util.Comparator;

public class CapacityOfPassengersSortComporator implements Comparator<AbstractPlane> {
    @Override
    public int compare(AbstractPlane o1, AbstractPlane o2) {
        return o1.getCapacityOfPassengers() - o2.getCapacityOfPassengers();
    }
}
