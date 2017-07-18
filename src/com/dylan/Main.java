package com.dylan;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number.");
        int operand1 = scanner.nextInt();
        System.out.println("Enter number.");
        int operand2 = scanner.nextInt();
        int sum = operand1 + operand2;
        int difference = operand1 - operand2;
        int division = operand1 / operand2;
        int remainder = operand1 % operand2;
        int multiplication = operand1 * operand2;
        System.out.println("The sum is  " + " " + sum);
        System.out.println("The difference is " + " " + difference);
        System.out.println("When divided it equals " + " " + division + " " + " with a remainder of " + remainder);
        System.out.println(" When multiplied it equals " + " " + multiplication);

    }
}
