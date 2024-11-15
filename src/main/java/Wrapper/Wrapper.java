package Wrapper;



public class Wrapper {
    public static void main(String[] args) {
        // Wrapper classes wraps the primitive data types
        // primitive int
        // Primitive data types cannot be used inside List<>
        int a = 2; // here a is a primitive variable
        // Wrapper class for Integer
        // Wrapper classes can be used inside List<>
        // Wrapper class comes with the methods
        Integer b = 4; // here b is a reference variable which holds addr of 4
        // some of the methods from wrapper classes
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(4,-1));
        System.out.println(Integer.min(7,-3));
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(10));

        // Other wrapper classes for primitive types
        // 2) Boolean
        boolean bool = true;
        // Wrapper for boolean is
        Boolean boolNew = false;

        // 3) Float
        float f = 3.14f;
        // Wrapper class Float
        Float fvar = 3.14f;
        System.out.println(fvar);

        // 4) Long
        long l = 123455L;
        // Wrapper class Long
        Long lvar = 8788993490L;
        System.out.println(lvar);

        // 5) Double
        double d = 123.12343542;
        // Wrapper class Double
        Double dvar = 123.12313433434;
        System.out.println(dvar);

        // Autoboxing :- Automatic Conversion from primitive type to the object of their corresponding
        // wrapper classes is known as autoboxing
        int c = 5;
        Integer z = c; // autoboxing
        System.out.println(z);

        // Unboxing :- Automatically converting an object of wrapper class to its corresponding primitive type
        Integer x = 25;
        int new_int = x; //Unboxing
        System.out.println(new_int);


    }
}
