package by.milavitsky.homework.validation;

import by.milavitsky.homework.enums.CivilianPlaneType;
import by.milavitsky.homework.enums.WarPlaneType;

import static by.milavitsky.homework.entity.AirLine.*;

public class Validator {
    private static CivilianPlaneType[] civilianPlaneTypes = CivilianPlaneType.values();
    private static WarPlaneType [] warPlaneTypes = WarPlaneType.values();

    public static boolean isIndexTrue(int index){
        int size = airLine.getSize();
        return index >= 0 & index < size;
    }

    public static boolean isEnginePowerCorrect(int value){
        return value > 50 & value < 1500;
    }

    public static boolean isLiftingCapacityCorrect(int value){
        return value > 20 & value < 150;
    }

    public static boolean isCapacityOfPassengersCorrect(int value){
        return value > 1 & value < 400;
    }

    public static boolean isFuelConsumptionCorrect(int value){
        return value > 10 & value < 300;
    }

    public static boolean isTankCapacityCorrect(int value){
        return value > 100 & value < 2000;
    }

    public static boolean isMaxSpeedCorrect(int value){
        return value > 300 & value < 1500;
    }

    public static boolean isWeightCorrect(int value){
        return value > 1 & value < 200;
    }

    public static boolean isTypeCorrect(String type){
        for (CivilianPlaneType civilianPlaneType : civilianPlaneTypes) {
            if (type.equals(civilianPlaneType.toString())) {
                return true;
            }
        }
        for (WarPlaneType warPlaneType : warPlaneTypes) {
            if (type.equals(warPlaneType.toString())) {
                return true;
            }
        }

        return false;
    }//todo общую валидацию
}
