package by.milavitsky.homework.entity;

import by.milavitsky.homework.exception.IncorrectIdException;
import by.milavitsky.homework.exception.IncorrectValueException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public class AirLine implements Serializable {
    private final ArrayList<AbstractPlane> listPlane = new ArrayList<AbstractPlane>();
    public static final AirLine airLine = new AirLine();
    private static final int MAXSIZE = 100;

    private AirLine() {
    }

    public void add(AbstractPlane plane) {
        try {
            if (listPlane.size() < MAXSIZE) {
                listPlane.add(plane);
            } else {
                throw new IncorrectValueException("Airline size peaks");
            }
        } catch (IncorrectValueException ex) {
            System.out.println(ex.getMessage() + " " + Arrays.toString(ex.getStackTrace()));
        }

    }

    public ArrayList<AbstractPlane> getListPlane() {
        return listPlane;
    }

    public int getSize() {
        return listPlane.size();
    }

    public UUID getId(int index) {
        return listPlane.get(index).getId();
    }

    public UUID getId(AbstractPlane plane) {
        for (int i = 0; i < listPlane.size(); i++) {
            if (plane.equals(listPlane.get(i))) {
                return listPlane.get(i).getId();
            }
        }
        return null;
    }

    public int getEnginePower(int index) {
        return listPlane.get(index).getEnginePower();
    }

    public int getEnginePower(AbstractPlane plane) {
        for (int i = 0; i < listPlane.size(); i++) {
            if (plane.equals(listPlane.get(i))) {
                return listPlane.get(i).getEnginePower();
            }
        }
        return 0;
    }

    public int getLiftingCapacity(int index) {
        return listPlane.get(index).getLiftingCapacity();
    }

    public int getLiftingCapacity(AbstractPlane plane) {
        for (int i = 0; i < listPlane.size(); i++) {
            if (plane.equals(listPlane.get(i))) {
                return listPlane.get(i).getLiftingCapacity();
            }
        }
        return 0;
    }

    public int getCapacityOfpassengers(int index) {
        return listPlane.get(index).getCapacityOfpassengers();
    }

    public int getCapacityOfpassengers(AbstractPlane plane) {
        for (int i = 0; i < listPlane.size(); i++) {
            if (plane.equals(listPlane.get(i))) {
                return listPlane.get(i).getCapacityOfpassengers();
            }
        }
        return 0;
    }

    public int getTankCapacity(int index) {
        return listPlane.get(index).getTankCapacity();
    }

    public int getTankCapacity(AbstractPlane plane) {
        for (int i = 0; i < listPlane.size(); i++) {
            if (plane.equals(listPlane.get(i))) {
                return listPlane.get(i).getTankCapacity();
            }
        }
        return 0;
    }

    public int getmaxSpeed(int index) {
        return listPlane.get(index).getMaxSpeed();
    }

    public int getmaxSpeed(AbstractPlane plane) {
        for (int i = 0; i < listPlane.size(); i++) {
            if (plane.equals(listPlane.get(i))) {
                return listPlane.get(i).getMaxSpeed();
            }
        }
        return 0;
    }

    public int getWeight(int index) {
        return listPlane.get(index).getWeight();
    }

    public int getWeight(AbstractPlane plane) {
        for (int i = 0; i < listPlane.size(); i++) {
            if (plane.equals(listPlane.get(i))) {
                return listPlane.get(i).getWeight();
            }
        }
        return 0;
    }

    public UUID getfuelСonsumption(int index) {
        return listPlane.get(index).getId();
    }

    public UUID getfuelСonsumption(AbstractPlane plane) {
        for (int i = 0; i < listPlane.size(); i++) {
            if (plane.equals(listPlane.get(i))) {
                return listPlane.get(i).getId();
            }
        }
        return null;
    }


    public AbstractPlane recieveByIndex(int index) {
        return listPlane.get(index);
    }


    public void remove(int index) {
        try {
            if (index <= (listPlane.size() - 1) & index >= 0) {
                listPlane.remove(index);
            } else {
                throw new IncorrectValueException("Index out of the bound");
            }
        } catch (IncorrectValueException ex) {
            System.out.println(ex.getMessage() + ", " + Arrays.toString(ex.getStackTrace()));
        }
    }

    public void remove(AbstractPlane plane) {
        listPlane.remove(plane);
    }

    public void remove(UUID id) {
        try {
            for (int i = 0; i < listPlane.size(); i++) {
                if (listPlane.get(i).getId() == id) {
                    listPlane.remove(i);
                } else {
                    throw new IncorrectIdException("Not found id");
                }
            }
        } catch (IncorrectIdException ex) {
            System.out.println(ex.getMessage() + ", " + Arrays.toString(ex.getStackTrace()));
        }
    }

    public void setPlaneByIndex(int index, AbstractPlane plane) {
        try {
            if (index <= (listPlane.size() - 1) & index >= 0) {
                listPlane.set(index, plane);
            } else {
                throw new IncorrectValueException("Index out of the bound");
            }
        } catch (IncorrectValueException ex) {
            System.out.println(ex.getMessage() + ", " + Arrays.toString(ex.getStackTrace()));
        }
    }

    public void removeAll() {
        listPlane.removeAll(listPlane);
    }


}
