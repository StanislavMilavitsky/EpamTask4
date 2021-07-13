package by.milavitsky.homework.service.comporator;

import by.milavitsky.homework.entity.AbstractPlane;

import java.util.Comparator;

public class LiftingCapacitySortReverseComporator implements Comparator<AbstractPlane> {
    @Override
    public int compare(AbstractPlane o1, AbstractPlane o2) {
        return new LiftingCapacitySortComporator().reversed().compare(o1, o2);
    }
}
