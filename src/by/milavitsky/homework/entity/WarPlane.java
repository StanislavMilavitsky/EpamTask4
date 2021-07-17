package by.milavitsky.homework.entity;

import by.milavitsky.homework.enums.WarPlaneType;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class WarPlane extends AbstractPlane implements Serializable {
    private final WarPlaneType warPlaneType;
    private final String warPlaneModel;

    public WarPlane(WarPlaneType warPlaneType, String model) {
        warPlaneModel = model;
        this.warPlaneType = warPlaneType;
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
        return 21 * this.getLiftingCapacity() + 25 * this.getMaxSpeed() + 27 * this.getWeight() + this.getId().hashCode();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " type = " + warPlaneType +
                ", model = " + warPlaneModel +
                ", engine power= " + getEnginePower() +
                ", lifting capacity= " + getLiftingCapacity() +
                ", capacity of passengers= " + getCapacityOfPassengers() +
                ", fuel consumption= " + getFuelСonsumption() +
                ", tank capacity= " + getTankCapacity() +
                ", max speed= " + getMaxSpeed() +
                ", weight= " + getWeight() +
                ", id= " + getId() + "." + "\n";
    }
}

