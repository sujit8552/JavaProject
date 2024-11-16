package ExceptionHandling;

/*
* Types of Errors
* 1) Syntax error
* 2) Logical error - error in programmer's logic
* 3) Runtime error - error will occur only at time of running the code
*  Program will crash during runtime error.
*  Program will run except some cases.
*
* Q) What is Exception handling?
* Ans => Exception Handling is a way to handle the runtime errors so that the normal flow
*        of the application can be maintained.
*
* Q) What is Exception?
* Ans => Exception is an event that disrupts the normal flow of the program.
*        It is an object which is thrown at runtime
*
* Hierarchy of exception
* multiple catch block
* toString()
* try(try())
* */

class Studnt{
    int id;
}

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numerators = {10,200,30,40};
        int[] denominators = {1,2,0,4};
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(divide(numerators[i], denominators[i]));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Good Job ;)");
    }
    public static int divide(int a, int b){
        try {
            //Studnt s = null;
            //s.id = 12; // null pointer exception will be thrown
            return a / b;
        } catch (NullPointerException e){
            System.out.println("Null pointer exception :(");
            return -1;
        }
        catch (ArithmeticException t){
            System.out.println("Arithmetic Exception :(");
            return -1;
        }catch (Exception e){  //e is nothing but reference to object thrown
            System.out.println(e);
            return -1;
        }
    }
}
