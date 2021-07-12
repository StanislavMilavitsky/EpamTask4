package by.milavitsky.homework.entity;

import java.io.Serializable;
import java.util.UUID;

public abstract class AbstractPlane implements Serializable, Cloneable {

    private int enginePower;
    private int liftingCapacity;
    private int capacityOfPassengers;
    private int fuelСonsumption;
    private int tankCapacity;
    private int maxSpeed;
    private int weight;
    private UUID id;

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public int getCapacityOfPassengers() {
        return capacityOfPassengers;
    }

    public void setCapacityOfPassengers(int capacityOfPassengers) {
        this.capacityOfPassengers = capacityOfPassengers;
    }

    public int getFuelСonsumption() {
        return fuelСonsumption;
    }

    public void setFuelСonsumption(int fuelСonsumption) {
        this.fuelСonsumption = fuelСonsumption;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    protected abstract void generationId();
}
