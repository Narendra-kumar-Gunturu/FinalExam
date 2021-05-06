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
public class TrowsEx {
    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun()");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args)
    {
        System.out.println("Narendra Kumar Gunturu");
        System.out.println("Solution for Question:9");
        try
        {
            fun();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("cought in main");
        }
    }
    
}
