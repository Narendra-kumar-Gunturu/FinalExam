/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        
	ComparableCircle circle1 = new ComparableCircle(9);
	ComparableCircle circle2 = new ComparableCircle(18);
        System.out.println("Narendra Kumar Gunturu");
        System.out.println("Solution for Question:5");
	System.out.println("Circle1:");
	System.out.println(circle1);
	System.out.println("Circle2:");
	System.out.println(circle2);
	System.out.println((circle1.compareTo(circle2) == 1 ? "Circle1 " : "Circle2 ") + "is the larger of two Circles.");
    }
    
}