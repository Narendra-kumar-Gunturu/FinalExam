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
import java.io.FileReader;
import java.io.IOException;

public class Example2{

    public static void main(String[] args) {

        int[] unChecked = new int[15];
        System.out.println("Narendra Kumar Gunturu");
        System.out.println("Solution for Question:6");

        for (int i = 0; i < unChecked.length; i++) {
            unChecked[i] = i;
        }

        try {
            System.out.println(unChecked[30]);
        } catch (ArrayIndexOutOfBoundsException u) {
            System.out.println("The array is of length less than the specified index");
        }

        try {
            FileReader file = null;

            file.read();
        } catch (NullPointerException n) {
            //Alternate logic
            System.out.println("NullPointer Exception");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

}

