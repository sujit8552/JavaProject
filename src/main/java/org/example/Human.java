package org.example;

public interface Human {
    int no_of_legs = 2;
    int no_of_hands = 2; //snakecase
    public void Walk();
    public static void Eats(){
        System.out.println("Human eats");
    }
    public default void Run(){
        System.out.println("Human Runs");
    }
    public default void Sleeps(){
        System.out.println("Human Sleeps");
    }
}

