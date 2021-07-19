package by.milavitsky.homework.main;

import static by.milavitsky.homework.entity.AirLine.*;

import by.milavitsky.homework.reader.FilePlaneReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
          airLine.add(FilePlaneReader.readFile("src/resources/data_base.txt"));  ;//todo динамически через аргументы
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(airLine.getListPlane());

    }
}
