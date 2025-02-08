import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        System.out.println("enter a number to take fibbonacci number=");
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int data=fibo(number);
        System.out.println("fibonacci number is="+data);
    }
    public static int fibo(int number){
//        base case
      if(number==0 || number==1){
          return number;
      }
      return fibo(number-1)+fibo(number-2);
    }
}
