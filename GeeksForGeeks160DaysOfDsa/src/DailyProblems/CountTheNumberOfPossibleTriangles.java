package DailyProblems;

import java.util.Arrays;

public class CountTheNumberOfPossibleTriangles {
    public static void main(String[] args) {
       int[] nums1 = {4, 6, 3, 7};
        int ans=Triangle(nums1);
    }
    public static int Triangle(int arr1[]){
        int n= arr1.length;
        if(n<3) return 0;
        Arrays.sort(arr1);
        for (int i = n-1; i >=2 ; i++) {
           int k=0,j=i-1;//to avoid the last element
        }
    }
}
