package by.milavitsky.homework.entity;

public class CivilianPlaneModel {
    private CivilianPlaneType type;
    private String model;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CivilianPlaneType getType() {
        return type;
    }

    public void setType(CivilianPlaneType type) {
        this.type = type;
    }
}
