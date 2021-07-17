package by.milavitsky.homework.entity;

import by.milavitsky.homework.exception.*;

import static by.milavitsky.homework.validation.Validator.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

public class AirLine implements Serializable {
    private final ArrayList<AbstractPlane> listPlane = new ArrayList<AbstractPlane>();
    public static final AirLine airLine = new AirLine();
    private static final int MAXSIZE = 100;

    private AirLine() {
    }

    public void add(AbstractPlane plane) {
            if (listPlane.size() < MAXSIZE) {
                listPlane.add(plane);
            } else {
                throw new MaxSizeReachedException();
            }
    }

    public void add(ArrayList listPlanes){
        listPlane.addAll(listPlanes);
    }

    public ArrayList<AbstractPlane> getListPlane() {
        return listPlane;
    }

    public AbstractPlane getPlane(int index) {
            if (isIndexTrue(index)) {
                return listPlane.get(index);
            } else {
                throw new IndexOutOfBoundsException();
            }
    }

    public int getSize() {
        return listPlane.size();
    }


    /*public UUID getId(AbstractPlane plane) {
        for (int i = 0; i < listPlane.size(); i++) {
            if (plane.equals(listPlane.get(i))) {
                return listPlane.get(i).getId();
            }
        }
        return null;
    }*/
    public void remove(int index) {
            if (isIndexTrue(index)) {
                listPlane.remove(index);
            } else {
                throw new IndexOutOfBoundsException();
            }
    }

    public void remove(AbstractPlane plane) {
        listPlane.remove(plane);
    }

    public void remove(UUID id) throws IncorrectIdException {
            for (int i = 0; i < listPlane.size(); i++) {
                if (listPlane.get(i).getId() == id) {
                    listPlane.remove(i);
                } else {
                    throw new IncorrectIdException();
                }
            }
    }

    public void setPlaneByIndex(int index, AbstractPlane plane) {
            if (isIndexTrue(index)) {
                listPlane.set(index, plane);
            } else {
                throw new IndexOutOfBoundsException();
            }
    }

    public void removeAll() {
        listPlane.removeAll(listPlane);
    }


}
