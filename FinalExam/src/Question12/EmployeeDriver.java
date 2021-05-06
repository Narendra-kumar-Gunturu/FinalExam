/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ArrayList<Employee> a=new ArrayList<Employee>();  
    a.add(new Employee(1,"Narendra",13000));    
    a.add(new Employee(2,"Veda",5000));
    a.add(new Employee(3,"Pramod",24000));
    a.add(new Employee(4,"Sandeep",16000));
    a.add(new Employee(5,"Vivek",90000));
    System.out.println("Narendra Kumar Gunturu");
    System.out.println("Solution for Question:12 ");

    System.out.println("The original list is :");
        for(Employee st:a){ 
            System.out.println(st.toString()); 
	} 
    System.out.println("After the sorting with employee id :");
    Collections.sort(a);  
	for(Employee st:a){  
            System.out.println(st.toString());
	}  
    System.out.println("After sorting with salary :");
    Collections.sort(a,new Comparator<Employee>(){
    @Override
    public int compare(Employee arg0, Employee arg1) {
    return Double.compare(arg0.getEmpSalary(), arg1.getEmpSalary());
	}
        });
    for(Employee st:a){  
	System.out.println(st.toString());
	}  
    System.out.println("After sorting with employee name :");
    Collections.sort(a,new Comparator<Employee>(){
    @Override
    public int compare(Employee S1, Employee S2) {
    return S1.getEmpName().compareTo(S2.getEmpName());
        }
        });
    for(Employee st:a){  
	System.out.println(st.toString());
	}  

    }

}
