import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        for (int row=0;row<arr.length;row++){
            System.out.println(arr.length);
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row].length);
                System.out.println("Enter the elements");
                arr[row][col]=sc.nextInt();
            }
        }
//        for (int row=0;row<arr.length;row++){
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
         for (int i=0;i<arr.length;i++){
             System.out.println(Arrays.toString(arr[i]));
         }
    }
}
