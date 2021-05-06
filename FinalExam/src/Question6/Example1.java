/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author Narendra Kumar Gunturu
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example1 {

    public static void main(String args[]) {


        FileInputStream file = null;
        System.out.println("Narendra Kumar Gunturu");
        System.out.println("Solution for Question:6");

        try {
            file = new FileInputStream("name.txt");
        } catch (FileNotFoundException f) {
            System.out.println("File Not Found");
        }

        int z;

        try {
            int num1 = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }

    }
}
