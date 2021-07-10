package by.milavitsky.homework.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class CivilianPlane extends AbstractPlane implements Serializable {
    private final CivilianPlaneType civilianPlaneType;
    private final CivilianPlaneModel civilianPlaneModel = new CivilianPlaneModel();

    public CivilianPlane(CivilianPlaneType civilianPlaneType, String model) {
        civilianPlaneModel.setModel(model);
        this.civilianPlaneType = civilianPlaneType;
        generationId();
    }


    /**
     * Generate random id for plane with UUID class
     */
    @Override
    protected void generationId() {
        UUID uuid = UUID.randomUUID();
        this.setId(uuid);
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
        return 21 * this.getLiftingCapacity() + 21 * this.getMaxSpeed() + 21 * this.getWeight() + this.getId().hashCode();
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " Plane" +
                " type = " + civilianPlaneType +
                ", model = " + civilianPlaneModel.getModel();
    }
}
