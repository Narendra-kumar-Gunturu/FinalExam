/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class Student {
    int stuId;  
    String stuName;  
    public int getstuId() {
        return stuId;
    }

    public void setstuId(int stuId) {
	this.stuId = stuId;
    }

    public String getstuName() {
	return stuName;
    }

    public void setstuName(String stuName) {
	this.stuName = stuName;
    }

    Student(int stuId,String stuName){  
 	this.stuId=stuId;  
 	this.stuName=stuName;                  
    }
    @Override
    public boolean equals(Object obj) {
        // checking if both the object references are referring to the same object.

        if (this == obj) {
            return true;
        }
        // it checks if the argument is of the type MyClass by comparing the classes
	// of the passed argument and this object. if(!(obj instanceof MyClass)) return false; ---> avoid.

        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
         
        }
        final Student other = (Student) obj;
        if (this.stuId != other.stuId) {
            return false;
        }
        if (!Objects.equals(this.stuName, other.stuName)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        // We are returning the MyClass_id as a hashcode value.
	// we can also return someother calculated value or may be memory address of the
	// Object on which it is invoked.it depends on how you implement hashCode() method.

        int hash = 6;
        hash = 84 * hash + this.stuId;
        hash = 84 * hash + Objects.hashCode(this.stuName);
        return hash;
    }
        
}