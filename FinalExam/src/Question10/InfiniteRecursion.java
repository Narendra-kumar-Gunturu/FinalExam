/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.Scanner;

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class InfiniteRecursion {
    
    public static void main(String args[]){
        
        System.out.println("Narendra Kumar Gunturu");
        System.out.println("Solution for Question:10");
        System.out.println("Please any number for multiples");

        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        isNegative(num);
    }
    public static void isNegative(int num){
        
        if(num < 0){
            

            isNegative(num-1);
            }
        else
        {
            System.out.println(num +" Positive");
            
        }
    }
}