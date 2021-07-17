package by.milavitsky.homework.reader;

import by.milavitsky.homework.entity.AbstractPlane;
import by.milavitsky.homework.exception.IncorrectValuesOfFileException;
import by.milavitsky.homework.parser.FilePlaneParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class FilePlaneReader {

    public static ArrayList<AbstractPlane> readFile(String path) throws IOException {
        StringBuilder builder = new StringBuilder();
        ArrayList<AbstractPlane> list = new ArrayList<AbstractPlane>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        //*
        // Skip header, 1 line
        if (bufferedReader.ready()) {
            bufferedReader.readLine();
        }
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            try {
                list.add(FilePlaneParser.parsePlaneFile(line));
            } catch (IncorrectValuesOfFileException e) {
                e.printStackTrace();
            }
        }
        bufferedReader.close();
        return list;
    }
}
