/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class Example1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="Narendra Kumar Gunturu";
        String rev = reverseString(s);
        System.out.println("Narendra Kumar Gunturu");
        System.out.println("Solution for Example:10");
        System.out.println("Reversed String is : "+rev);
    }

    private static String reverseString(String s) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         if(s.isEmpty())
         {
             return s;
             
         }else
         return reverseString(s.substring(1))+s.charAt(0);
         
    }
}
