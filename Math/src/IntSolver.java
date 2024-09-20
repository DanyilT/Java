/*
Created by: Dany
Created on 12/10/2022 : 10:20
This is program to calculate the hundreds, tens, ones digit, sum and product of the digits of an integer
*/

import java.util.Scanner;

public class IntSolver {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        int a = scanner.nextInt();

        while (a > 100000) {
            System.out.println("Too large a number" + "\nplease write a shorter number");
            a = scanner.nextInt();
        }

        try {
            int a1 = a/100;
            int a2 = a/10%10;
            int a3 = a%10;
            System.out.println("The hundreds digit is " + a1);
            System.out.println("The tens digit is " + a2);
            System.out.println("The ones digit is " + a3);
            System.out.println("The sum of the digits is " + (a1 + a2 + a3));
            System.out.println("The product of the digits is " + (a1 * a2 * a3));
        } catch (Exception e) {
            System.err.println("Error");
        }
    }
}
