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
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Example2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {


        File file = new File("numerics.txt");
        DataInputStream dIS = null;

        dIS = new DataInputStream(new FileInputStream(file));
        while (true) {
            int i = dIS.readInt();
            System.out.println(i);
        }

    }

}
