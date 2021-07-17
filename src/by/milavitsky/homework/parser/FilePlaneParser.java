package by.milavitsky.homework.parser;

import by.milavitsky.homework.entity.AbstractPlane;
import by.milavitsky.homework.entity.CivilianPlane;
import by.milavitsky.homework.entity.WarPlane;
import by.milavitsky.homework.enums.CivilianPlaneType;
import by.milavitsky.homework.enums.WarPlaneType;
import by.milavitsky.homework.exception.IncorrectValuesOfFileException;

import static by.milavitsky.homework.validation.Validator.*;
import static java.lang.Integer.parseInt;

public class FilePlaneParser {


    public static AbstractPlane parsePlaneFile(String string) throws IncorrectValuesOfFileException {
        String delimeter = ","; // todo рефлексия, регулярные выражения
        String[] resultPlane = string.split(delimeter); // todo через эксепшн,логи
        int[] parameters = new int[7];
        for (int i = 3; i < resultPlane.length; i++) {
            parameters[i - 3] = parseInt(resultPlane[i]);
        }
        if (resultPlane[0].equals("Civilian")) {
            CivilianPlaneType[] civilianPlaneTypes = CivilianPlaneType.values();
            for (CivilianPlaneType civilianPlaneType : civilianPlaneTypes) {
                if (resultPlane[1].equals(civilianPlaneType.toString())) {
                    CivilianPlane civilianPlane;
                    if (isTypeCorrect(resultPlane[1])) {
                        civilianPlane = new CivilianPlane(CivilianPlaneType.valueOf(resultPlane[1]), resultPlane[2]);
                        if (isEnginePowerCorrect(parameters[0])) {
                            civilianPlane.setEnginePower(parameters[0]);
                        }
                        if (isLiftingCapacityCorrect(parameters[1])) {
                            civilianPlane.setLiftingCapacity(parameters[1]);
                        }
                        if (isCapacityOfPassengersCorrect(parameters[2])) {
                            civilianPlane.setCapacityOfPassengers(parameters[2]);
                        }
                        if (isFuelConsumptionCorrect(parameters[3])) {
                            civilianPlane.setFuelСonsumption(parameters[3]);
                        }
                        if (isTankCapacityCorrect(parameters[4])) {
                            civilianPlane.setTankCapacity(parameters[4]);
                        }
                        if (isMaxSpeedCorrect(parameters[5])) {
                            civilianPlane.setMaxSpeed(parameters[5]);
                        }
                        if (isWeightCorrect(parameters[6])) {
                            civilianPlane.setWeight(parameters[6]);
                        }
                        return civilianPlane;
                    }
                }
            }
        } else if (resultPlane[0].equals("War")) {
            WarPlaneType[] warPlaneTypes = WarPlaneType.values();
            for (WarPlaneType warPlaneType : warPlaneTypes) {
                if (resultPlane[1].equals(warPlaneType.toString())) {
                    WarPlane warPlane;
                    if (isTypeCorrect(resultPlane[1])) {
                        warPlane = new WarPlane(WarPlaneType.valueOf(resultPlane[1]), resultPlane[2]);
                        if (isEnginePowerCorrect(parameters[0])) {
                            warPlane.setEnginePower(parameters[0]);
                        }
                        if (isLiftingCapacityCorrect(parameters[1])) {
                            warPlane.setLiftingCapacity(parameters[1]);
                        }
                        if (isCapacityOfPassengersCorrect(parameters[2])) {
                            warPlane.setCapacityOfPassengers(parameters[2]);
                        }
                        if (isFuelConsumptionCorrect(parameters[3])) {
                            warPlane.setFuelСonsumption(parameters[3]);
                        }
                        if (isTankCapacityCorrect(parameters[4])) {
                            warPlane.setTankCapacity(parameters[4]);
                        }
                        if (isMaxSpeedCorrect(parameters[5])) {
                            warPlane.setMaxSpeed(parameters[5]);
                        }
                        if (isWeightCorrect(parameters[6])) {
                            warPlane.setWeight(parameters[6]);
                        }
                        return warPlane;
                    }
                }
            }
        }
        throw new IncorrectValuesOfFileException();
    }
}


