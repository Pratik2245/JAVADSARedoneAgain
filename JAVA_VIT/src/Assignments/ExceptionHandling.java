package Assignments;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Exceptions e=new Exceptions();
        Scanner sc=new Scanner(System.in);

        //for divide by zero error
        System.out.println("Enter Number1");
        int num1=sc.nextInt();
        System.out.println("Enter Number2");
        int num2=sc.nextInt();
        e.DivideNumber(num1,num2);

//        for arrayIndexOutOfBound
        int arr[]={10,20,30,40,50};
        System.out.println("Enter a Index to Access The Array Elements");
        int index=sc.nextInt();
        e.arrayIndexOutOfBound(arr,index);

//        for null pointer exception
        System.out.println("Enter a String=");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals("null")){
            s=null;
        }
        e.nullPointerException(s);
    }
}

class Exceptions{
    public void DivideNumber(int num1,int num2){
        int result;
        try{
            result= num1/num2;
        }catch (ArithmeticException e){
            System.out.println("Divide By Zero Error");
        }
    }


    public void arrayIndexOutOfBound(int arr[],int index){
        try{
            System.out.println("Array element at index " + index + ": " + arr[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("OOPs!!! Array Index " + index + " out of bounds for length");
        }
    }

    public void nullPointerException(String str) {
         try {
             System.out.println("Length of the string: "+str.length());
         }catch (NullPointerException e){
             System.out.println("Null Pointer Exception");
         }
    }
}
