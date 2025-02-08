import java.util.Scanner;

public class calculateNumberPrimeOrNot {
    public static void main(String[] args) {
        int number=13;
        int div=2;
        if(number<=1){
            System.out.println("enter a valid Number");
            return;
        }
        while (div*div <= number){
            if(number%div==0){
                System.out.println("number not  prime number="+number);
                return;
            }else{
                div++;
            }
        }
        System.out.println("number is prime number"+number);
    }
}
