package org.example;

import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isBreak = false;

        while (!isBreak) {
            System.out.println("Do you want to take a break?");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("yes")) {
                System.out.println("Well take a break!");
                isBreak = true;
            }
        }
    }
}
