import java.util.Scanner;

public class arithemeticOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number=");
        double number1=sc.nextInt();
        System.out.println();
        System.out.print("Enter second Number=");
        double number2=sc.nextInt();
        //addition
        System.out.println("Addition="+(number1+number2));
        //substraction
        System.out.println("Substraction="+(number1-number2));
        //multiplication
        System.out.println("Multiplication="+(number1*number2));
        //division
        System.out.println("Division="+(number2/number2));
    }
}
