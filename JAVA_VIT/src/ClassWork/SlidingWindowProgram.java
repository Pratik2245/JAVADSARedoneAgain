package ClassWork;

import javax.swing.plaf.basic.BasicGraphicsUtils;
import java.util.Arrays;

public class SlidingWindowProgram {
    public static void main(String[] args) {
//   int arr[]={3,-7,5,9,-24,70,8,10,-75};
//        int sum=0;
//        int lastSum=0;
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]<0){
//                lastSum=sum;
//                sum=0;
//                continue;
//            }
//            sum+=arr[i];
//
//        }
//        System.out.println(lastSum);
//    }
        int arr2[] = {8, 2, 4, 5, 3, 7, 1};
        System.out.println( missingNumber(arr2));
    }
        public static int missingNumber(int arr[]){
        Arrays.sort(arr); // Sorting the array

        // Find the missing number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) { // Check for missing number
               return i+1;
            }
        }
        return arr.length+1;
    }
}
