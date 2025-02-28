package ClassWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> list=SpiralMatrix1(arr);
        System.out.println(list);
    }
    public static List<Integer> SpiralMatrix1(int arr[][]){

        int startCol=0,endCol=arr[0].length-1;
        int startRow=0,endRow=arr.length-1;
        List<Integer> list=new ArrayList<>();
        if (arr == null || arr.length == 0) return list;

        while (startCol<=endCol && startRow<=endRow){
            for (int j = startCol; j <=endCol ; j++) {
                list.add(arr[startRow][j]);
            }
            startRow++;
            for (int i = startRow; i<=endRow; i++) {
                list.add(arr[i][endCol]);
            }
             endCol--;
            if(startRow<=endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    list.add(arr[endRow][i]);
                }
            }
            endRow--;
            if(startCol<=endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    list.add(arr[i][startCol]);
                }
            startCol++;
            }

        }
        
        return list;
    }
}
