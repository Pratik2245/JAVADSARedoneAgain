package Assignments;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("You shouldn’t divide a number by zero.");
        }

        try {
            int[] arr = { 1, 2, 3, 4, 5, 6 };
            System.out.print("Enter index to access: ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("OOPs!!! Array Index " + e.getMessage() + " out of bounds for length 6.");
        }

        try {
            String input = null;
            String str = input.equals("null") ? null : input;
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception arises!!");
        }

        scanner.close();
    }
}
