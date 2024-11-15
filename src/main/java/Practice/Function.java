package Practice;

// Concept 1

//class Student{
//    public int id;
//}
//
//public class Function {
//    public static void main(String[] args) {
//        Student student = new Student();
//        student.id = 1;
//        Fun(student);
//        System.out.println(student.id);
//    }
//
//    public static void Fun(Student a){
//        Student student = new Student();
//        student.id = 2;
//        a = student;
//    }
//}
// Here output is 1
//================ Another Concept 2 ==================
class Student{
    public int id;
}

public class Function {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 1;
        Fun(student);
        System.out.println(student.id);
    }

    public static void Fun(Student a){
        a.id = 2;
    }
}

// here output is 2
// Explaination is attached to Photo
