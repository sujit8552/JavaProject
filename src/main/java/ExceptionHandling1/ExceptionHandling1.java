package ExceptionHandling1;

/*
* Stack Trace
* stack trace provide detailed information about methods calls
*
* Checked & Unchecked Exception
* Unchecked exception means exceptions which are not checked by compiler at compile time
* For e.g. null pointer exception, array index out of bound exception
* Checked exception means exceptions which are checked by compiler at compile time
* For e.g. filereader exception
* */

import java.io.FileReader;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        try{
            level1();
        }
        catch (Exception o)
        {
            o.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader("a.txt");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void level3(){
        int[] array = new int[5];
        array[5] = 10;
    }
    public static void level2(){
        level3();
    }
    public static void level1(){
        level2();
    }
}
