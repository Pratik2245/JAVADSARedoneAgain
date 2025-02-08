package Packages;

import java.util.Scanner;

public class findOutMiddleNumberFrom3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the middle number
        int middle;
        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            middle = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            middle = num2;
        } else {
            middle = num3;
        }

        // Print the result
        System.out.println("The middle number is: " + middle);

        scanner.close();
    }
}
