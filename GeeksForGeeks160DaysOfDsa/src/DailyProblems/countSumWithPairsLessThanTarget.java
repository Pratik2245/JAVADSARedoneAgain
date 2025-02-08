package DailyProblems;

import java.util.Arrays;

public class countSumWithPairsLessThanTarget {
    public static void main(String[] args) {
        int arr[] = {7, 2, 5, 3};
        int target = 8;
//        int count=0;
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i+1; j <arr.length; j++) {
//                if(arr[i]+arr[j]<target){
//                 count++;
//                }
//            }
//        }
//        System.out.println(count);
        int ans = LessThanTarget(arr, target);
        System.out.println(ans);
    }

    public static int LessThanTarget(int arr[], int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;

        // Initialize two pointers
        int left = 0, right = n - 1;

        while (left < right) {
            // Check the sum of the current pair
            if (arr[left] + arr[right] < target) {
                // All pairs with arr[left] and elements from left+1 to right are valid
                count += (right - left);
                left++; // Move the left pointer to the right
            } else {
                right--; // Move the right pointer to the left
            }
        }
        return count;
    }

    }

