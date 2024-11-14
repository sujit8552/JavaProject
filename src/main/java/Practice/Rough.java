package Practice;

import java.util.PrimitiveIterator;

interface Man{
    public static void Walk(){
        System.out.println("Man walks");
    }
    public default void Run(){
        System.out.println("Man runs");
    }
}

interface Women{
    public static void Walk(){
        System.out.println("Women walks");
    }
    public default void Run(){
        System.out.println("Women runs");
    }
}

class Cyborg implements Man,Women{
    public void Walk(){
        Man.Walk();
    }
    @Override
    public void Run(){
        Man.super.Run();
    }
}

public class Rough {
    public static void main(String[] args) {
        Cyborg c = new Cyborg();
        c.Walk();
        c.Run();
    }
}
