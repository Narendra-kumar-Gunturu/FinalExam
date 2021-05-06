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
public class Square extends GeometricObject implements Colorable {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double area() {
        return Math.pow(sideLength, 2.0);
    }

}
