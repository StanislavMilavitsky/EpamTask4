package by.milavitsky.homework.service.comporator;

import by.milavitsky.homework.entity.AbstractPlane;

import java.util.Comparator;
public class LiftingCapacitySortComporator implements Comparator<AbstractPlane> {
    @Override
    public int compare(AbstractPlane o1, AbstractPlane o2) {
        return o1.getLiftingCapacity() - o2.getLiftingCapacity() ;
    }
}
