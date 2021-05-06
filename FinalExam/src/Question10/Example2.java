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
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = sum(10);
        System.out.println("Narendra Kumar Gunturu");
        System.out.println("Solution for Question:10");
        System.out.println(number);
    }
    public static int sum(int i)
    {
        if(i>0)
        {
            return i+sum(i-1);
        }else{
            return 0;
        }
    }
    
}