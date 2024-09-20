/*
Created by: Dany
Created on 06/01/2023 : 13:29
This is program is written to demonstrate Collatz Conjecture / Collatz's Hypothesis / (3n+1 problem)
*/

import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
//        int n = 3; // for testing

        while (true) {
            System.out.print("Enter a number for Collatz Conjecture, from which to start: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer number.");
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
        }

        System.out.println(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.println(n);
        }
    }
}
