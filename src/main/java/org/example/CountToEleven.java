package org.example;

import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number less than 11.");

        int number = scanner.nextInt();
        if (number >= 11) {
            System.out.println("Please enter less than 11.");

        } else {
            for (;number <= 11; number++) {
                System.out.println(number);


            }
        }
    }
}
