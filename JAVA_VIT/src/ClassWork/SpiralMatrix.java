package ClassWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        SpiralMatrix1(arr);
    }
    public static List<Integer> SpiralMatrix1(int arr[][]){
        int col=0;
        int row=0;
        List<Integer> list=new ArrayList<>();

        while (row<arr.length || col<arr[0].length){
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.println(arr[row][j]);
            }
            col++;
            row++;

        }
        
        return list;
    }
}
