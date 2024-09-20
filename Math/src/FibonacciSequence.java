/*
Created by: Dany
Created on 06/01/2023 : 11:11
This is program write Fibonacci Sequence
*/

import java.util.Scanner;

public class FibonacciSequence {
    // As args can be used as n(length) and start(starting number) <java FibonacciSequence 10 1>
    public static void main(String[] args) {
        int n = 0;
        int start = 1;

        if (args.length == 2) {
            try {
                n = Integer.parseInt(args[0]);
                start = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Please provide valid integers.");
                return;
            }
        } else if (args.length == 1) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Please provide a valid integer.");
                return;
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the $length of the Fibonacci sequence #");
            while (true) {
                if (scanner.hasNextInt()) {
                    n = scanner.nextInt();
                    if (n >= 2) {
                        break;
                    } else {
                        System.out.println("Please provide an integer greater than or equal to 2.");
                    }
                } else {
                    System.out.println("Please provide a valid integer.");
                    scanner.next(); // clear the invalid input
                }
            }
        }

        int[] fib = new int[n];
        fib[0] = start;
        fib[1] = start;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
