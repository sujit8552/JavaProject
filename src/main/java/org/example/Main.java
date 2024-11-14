package org.example;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(25,"Sujit");
        s1.setS_age(27);

        //--------------
        Sujit s = new Sujit();
        s.Walk();
        s.PrintInfo();
        s.Run();
        s.Sleeps();
    }
}