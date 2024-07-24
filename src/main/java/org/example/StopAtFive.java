package org.example;

import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean num = false;

        while (!num) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number == 5) {
                num = true;

            }


        }
    }
}







