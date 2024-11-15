package Generics;

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

public class Generics {
    public static void main(String[] args) {
        Student<Integer> student= new Student<>(25);
        student.Print();
        Student<String> s = new Student<>("26");
        s.Print();
    }
}
