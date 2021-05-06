/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author S542360
 */
public class AbstractExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grocery g = new Grocery(20.0,2,2.5);
        System.out.println("Narendra Kumar Gunturu");
        System.out.println("Solution for Question:1 ");
        System.out.println("Price after tax " + g.priceAfterTax());
    }
    }
