/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

public class StudentDriver {

/**
 *
 * @author Narendra Kumar Gunturu
 */
  public static void main(String[] args) {
        // TODO code application logic here
        Student st1 = new Student(1, "NG");
        Student st2 = new Student(1, "rg"); 
        Student st3 = new Student(1, "NG"); 
        Student st4 = new Student(1, "rg"); 
        // comparing above created Objects.
        System.out.println("Narendra Kumar Gunturu");
        System.out.println("Solution for Question:11");
       
        //addreess of two objects         
        System.out.println(st1==st3);
        System.out.println(st2==st3);
        System.out.println(st2==st4);
        System.out.println(st1==st4);
        
        //hashcodes of the objects
        System.out.println("hashcode of first NG = " + st1.hashCode());
        System.out.println("hashcode of second NG = " + st2.hashCode());
        System.out.println("hashcode of third rg = " + st3.hashCode());
        System.out.println("hashcode of fourth rg = " + st4.hashCode());

        //Instance variables of st2 and st4 were same so it returns true
        System.out.println("equals value is = " + st1.equals(st2));
        System.out.println(st2.equals(st4));
        System.out.println(st1.equals(st4));
        System.out.println(st3.equals(st4));
        
//        Comparing the hashcodes of the objects 
        System.out.println(st1.hashCode()==st2.hashCode());
        System.out.println(st1.hashCode()==st3.hashCode());
	}

}

