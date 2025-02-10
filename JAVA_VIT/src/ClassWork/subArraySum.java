package ClassWork;

import java.util.ArrayList;
import java.util.List;

public class subArraySum {
    public static void main(String[] args) {
        int arr[]={-1, -2, -3, -4};
        int target=-5;
       List<Integer> l= findSubArray(arr,target);
        System.out.println(l);
    }
    public static List<Integer> findSubArray(int arr[], int target) {
        List<Integer> list=new ArrayList<>();
        int sum = 0;
        int flag = 0;
        int startInd;
        int endInd;
        for (int i = 0; i < arr.length; i++) {
            startInd = i + 1;
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
//                printing the sum after every pass /
//                System.out.println("Checking subarray: " + (i+1) + " to " + (j+1) + " with sum: " + sum);
                if (sum == target) {
                    endInd = j + 1;
                    list.add(startInd);
                    list.add(endInd);
                    return list;
                }
            }

        }
        list.add(-1);
    return list;
    }
}
