package Assignments;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Exceptions e=new Exceptions();
//      For Divide By Zero Exception
        System.out.println("Case 1: Trying to divide 10 by 0...");
        e.DivideNumber(10,0);

//      For ArrayIndexOutOfBound
        int arr[]={10,20,30,40,50,60};
        System.out.println("\nCase 2: Trying to access index 7 in an array of length 6...");
        e.arrayIndexOutOfBound(arr,7);

//      For null pointer exception
        System.out.println("\nCase 3: Trying to find the length of a null string...");
        e.nullPointerException(null);
    }
}

class Exceptions{
    public void DivideNumber(int num1,int num2){
        try{
            int result=num1/num2;
            System.out.println("Result of division: " + result);
        }catch (ArithmeticException e){
            System.out.println("You shouldn’t divide a number by zero.");
        }
    }


    public void arrayIndexOutOfBound(int arr[],int index){
        try{
            System.out.println("Array element at index " + index + ": " + arr[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("OOPs!!! Array Index " + index + " out of bounds for length " + arr.length + ".");
        }
    }

    public void nullPointerException(String str) {
         try {
             if(str.equals("")){
                 str=null;
             }
             System.out.println("Length of the string: "+str.length());

         }catch (NullPointerException e){
             System.out.println("Null Pointer Exception arises!!");
         }
    }
}
