/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author Narendra Kumar Gunturu
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example1{

    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("Narendra Kumar Gunturu");
        System.out.println("Solution for Question:8");

        FileInputStream file = null;
        file = new FileInputStream("names.txt");
        int z;

        while ((z = file.read()) != -1) {
            System.out.print((char) z);
        }

        System.out.println();

        file.close();
    }

}
