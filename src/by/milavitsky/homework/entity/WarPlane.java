package by.milavitsky.homework.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class WarPlane extends AbstractPlane implements Serializable {
    private final WarPlaneType warPlaneType;
    private final WarPlaneModel warPlaneModel = new WarPlaneModel();

    public WarPlane(WarPlaneType warPlaneType, String model) {
        warPlaneModel.setModel(model);
        this.warPlaneType = warPlaneType;
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
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        WarPlane that = (WarPlane) obj;
        if(this.getId() == that.getId()){
            return true;
        }
        return warPlaneType == that.warPlaneType &&
                Objects.equals(warPlaneModel, that.warPlaneModel);
    }

    /**
     * Take 3 parameters more changes for hashcode, for less collision
     *
     * @return
     */
    @Override
    public int hashCode() {
        return 21 * this.getLiftingCapacity() + 21 * this.getMaxSpeed() + 21 * this.getWeight() + this.getId().hashCode();
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " Plane" +
                " type = " + warPlaneType +
                ", model = " + warPlaneModel.getModel();
    }
}

