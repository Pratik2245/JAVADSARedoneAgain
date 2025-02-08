package StringRedoneQuestions;

import java.util.Scanner;

public class StringINput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Enter input=");
            input=sc.next();

            if(input=="x"){
                break;
            }
        }
    }
}
