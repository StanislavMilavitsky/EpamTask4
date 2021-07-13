package by.milavitsky.homework.service.comporator;

import by.milavitsky.homework.entity.AbstractPlane;

import java.util.Comparator;

public class PlaneTypCivilianSortComporator implements Comparator<AbstractPlane> {
    @Override
    public int compare(AbstractPlane o1, AbstractPlane o2) {
        if (o1.getClass() != o2.getClass()){
            return 0;
        } else {
            return -1;
        }
    }
}
