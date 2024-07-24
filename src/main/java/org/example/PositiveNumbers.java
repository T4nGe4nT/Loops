package org.example;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number ( 0 to exit)");
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println(number);
            } else if (number < 0) {
                System.out.println("Enter a positive number");
            }
            else {
                break;
            }

        }
    }
}