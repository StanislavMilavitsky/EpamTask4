package by.milavitsky.homework.validation;

import static by.milavitsky.homework.entity.AirLine.*;

public class Validator {
    public static boolean isIndexTrue(int index){
        int size = airLine.getSize();
        return index >= 0 & index < size;
    }
}
