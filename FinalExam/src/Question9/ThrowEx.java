/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class ThrowEx {
    static void fun()
    {
        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("caught inside fun()");
            throw e;
        }
    }
    public static void main(String args[])
    {
        System.out.println("Narendra Kumar Gunturu");
        System.out.println("Solution for Question:9");
        try
        {
            fun();
        }
        catch(NullPointerException e)
                {
                    System.out.println("caught in main");
                }
    }
}
