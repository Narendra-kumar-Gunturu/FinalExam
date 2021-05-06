/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class Driver {

    public static void main(String[] args) {

        System.out.println("Narendra Kumar Gunturu");
        System.out.println("Solution for Question 2:\n");
        GeometricObject s1 = new Square(3.0);
        GeometricObject s2 = new Square(2.5);
        GeometricObject s3 = new Square(1.6);
        GeometricObject s4 = new Square(7.9);
        GeometricObject s5 = new Square(9.0);

        GeometricObject[] gArray = new GeometricObject[5];

        gArray[0] = s1;
        gArray[1] = s2;
        gArray[2] = s3;
        gArray[3] = s4;
        gArray[4] = s5;

        gArray[3].howToColor();
        for (int i = 0; i < gArray.length; i++) {
            System.out.print("Area of Square " + i + " is: " + gArray[i].area()
                    + " and ");
            gArray[i].howToColor();
        }
    }

}