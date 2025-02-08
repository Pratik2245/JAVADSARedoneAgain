import java.util.Scanner;

public class swappingNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number=");
        int num1=sc.nextInt();
        System.out.println("enter the second number=");
        int num2=sc.nextInt();
        System.out.println("Number1="+num1);
        System.out.println("Number2="+num2);
//        logic 1
//        int temp=num1;
//        num1=num2;
//        num2=temp;
//        logic 2
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Numbers after swapping=");
        System.out.println("Number1="+num1);
        System.out.println("Number2="+num2);
    }
}
