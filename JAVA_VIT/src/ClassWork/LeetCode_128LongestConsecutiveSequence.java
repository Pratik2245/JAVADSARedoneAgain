package ClassWork;

import java.util.Arrays;

public class LeetCode_128LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[]={0, 3, 7, 2, 5, 8, 4, 6,0, 1};
        Arrays.sort(arr);
        int count=1;
        int ans=1;
        for (int i = 0; i <arr.length-1 ; i++) {
            int after=i+1;
            if(arr[i]==arr[i+1]){
                continue;
            } else if(arr[i] == arr[i+1]-1){
                count++;
            }else {
                ans=Math.max(ans,count);
                count=1;
            }
        }
        ans=Math.max(ans,count);
        System.out.println(ans);
    }
}
