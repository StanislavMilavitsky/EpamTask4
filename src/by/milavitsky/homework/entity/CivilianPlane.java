package by.milavitsky.homework.entity;

import by.milavitsky.homework.enums.CivilianPlaneType;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class CivilianPlane extends AbstractPlane implements Serializable {
    private final CivilianPlaneType civilianPlaneType;
    private final String civilianPlaneModel;

    public CivilianPlane(CivilianPlaneType civilianPlaneType, String model) {
        civilianPlaneModel = model;
        this.civilianPlaneType = civilianPlaneType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){ return true;}
        if (getClass() != o.getClass()){
            return false;
        }
        CivilianPlane that = (CivilianPlane) o;
        if (this.getId() == that.getId()) {
            return true;
        }
        return civilianPlaneType == that.civilianPlaneType &&
                Objects.equals(civilianPlaneModel, that.civilianPlaneModel);
    }

    @Override
    public int hashCode() {
        return 21 * this.getLiftingCapacity() + 19 * this.getMaxSpeed() + 12 * this.getWeight() + this.getId().hashCode();
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " Plane" +
                " type = " + civilianPlaneType +
                ", model = " + civilianPlaneModel;
    }
}
