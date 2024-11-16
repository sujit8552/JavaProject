package Generics;

//type parameter OR Generic class
class Student<T>{
    T id;

    Student(T id){
        this.id = id;
    }
    public void Print(){
        System.out.println("Hello Dosto");
        System.out.println(id);
    }
}

// type parameter OR Generic class
class Animal<T>{
    private T id;

    Animal(){
    }
    public T GetId(){
        return id;
    }
    public void SetId(T id){
        this.id = id;
    }

    // Generic Method
    public static <T> void PrintHello(T name){
        System.out.println(name);
    }
}

// Bounded Generic classes (Restricted for some types only)
class Employee<T extends Number>{
    private T id;

    public void SetId(T id){
        this.id = id;
    }
    public T GetId(){
        return this.id;
    }
}

public class Generics {
    public static void main(String[] args) {
        // Generic class call
        Student<Integer> student= new Student<>(25);
        student.Print();
        Student<String> s = new Student<>("26");
        s.Print();

        // Generic methods
        PrintData("Sujit");
        PrintData(12);

        // Animal Generic class
        Animal<Integer> animal = new Animal<Integer>();
        animal.SetId(45);
        System.out.println("id is: "+animal.GetId());
        Animal<String> a = new Animal<String>();
        a.SetId("45");
        // Generic method
        Animal.PrintHello("SayMyName");
        Animal.PrintHello(1234);

        // Employee Bounded Generic class (Bounded to numbers)
        Employee<Integer> I = new Employee<Integer>();  // this is valid as Integer comes under number
        Employee<Float> F = new Employee<Float>(); // This is also valid as Float comes under number
        // Employee<String> E = new Employee<String>(); // This is not possible as String dont come under Number
        I.SetId(45);
        System.out.println(I.GetId());
        F.SetId(65F);
        System.out.println(F.GetId());
    }

    // This is how generic methods are created
    static <T> void PrintData(T data){
        System.out.println(data);
    }
}
// Just adding line for github testing
