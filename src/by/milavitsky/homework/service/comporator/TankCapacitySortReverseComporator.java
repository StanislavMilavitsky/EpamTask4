package by.milavitsky.homework.service.comporator;

import by.milavitsky.homework.entity.AbstractPlane;

import java.util.Comparator;

public class TankCapacitySortReverseComporator implements Comparator<AbstractPlane> {
    @Override
    public int compare(AbstractPlane o1, AbstractPlane o2) {
        return new TankCapacitySortComporator().reversed().compare(o1, o2);
    }
}
