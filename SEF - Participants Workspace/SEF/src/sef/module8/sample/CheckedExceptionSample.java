package sef.module8.sample;
// Needs to be completed

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionSample {

    public static void main(String arg[]) throws FileNotFoundException {

        String fileName = "SomeFileThatDoesNotExist.txt";

        //The following class is used to open a file for reading
        FileReader reader;
        /*try {
            //The following line must be written in a try catch block
            //else it would not compile since
            //FilenotFoundException is a checked exception.
            //1 - Instantiate reader and pass fileName as a parameter
            //2 - catch FileNotFoundException
            reader = new FileReader(fileName);

        } catch (FileNotFoundException exeption) {

            System.out.println("File " + fileName + " not found!");

        }*/

        reader = new FileReader(fileName);

    }
}
