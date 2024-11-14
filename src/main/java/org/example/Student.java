package org.example;

import lombok.Setter;

@Setter
public class Student {
    // fields
    private int s_age;
    private String s_name;
    // constructors
    Student(){} // non-param
    Student(int age, String name){ //parmeterized ctor
        this.s_age = age;
        this.s_name = name;
    }
    Student(Student s2){        // copy ctor
        this.s_name = s2.s_name;
        this.s_age = s2.s_age;
    }
    // Getter Methods
    public int GetStudentAge(){
        return this.s_age;
    }
    public String GetStudentName(){
        return this.s_name;
    }
    // Setter methods through project lombok
}
