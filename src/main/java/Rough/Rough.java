package Rough;

import java.util.Scanner;

public class Rough {
    public static void main(String[] args) {
        // take two inputs from user and divide them
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        int ans = 0;
        try{
            ans = a / b;
        }
        catch (Exception e){
            System.out.println("Divide by 0 not allowed");
        }

        System.out.println(ans);
    }
}
