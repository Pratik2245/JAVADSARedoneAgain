////package DailyProblems;
////
////import java.util.Arrays;
////
////public class LongestConsectiveSubsequence {
////    public static void main(String[] args) {
////        int arr[]={1, 9, 3, 10, 4, 20, 2};
////        int ans=longestConsecutive(arr);
////        System.out.println(ans);
////    }
////    public static int longestConsecutive(int[] arr) {
////        // code here
////        Arrays.sort(arr);
////        int current=0,lastSmaller=Integer.MIN_VALUE;
////        int longest=1;
////        for (int i = 0; i <arr.length ; i++) {
////            if(arr[i]-1==lastSmaller){
////                current=current+1;
////                lastSmaller=arr[i];
////            } else if (arr[i]-1!=lastSmaller) {
////                current=1;
////                lastSmaller=arr[i];
////            }
////            longest=Math.max(longest,current);
////        }
////        return  longest;
////    }
////}
//
//
////solution 2 optimal solution
////{ Driver Code Starts
//import java.io.*;
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//
//        while (t-- > 0) {
//            // Read first array
//            String input = br.readLine();
//            String[] inputArray = input.split(" ");
//            int[] arr = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();
//
//            Solution ob = new Solution();
//            int res = ob.longestConsecutive(arr);
//
//            System.out.println(res);
//            System.out.println("~");
//        }
//    }
//}
//
//// } Driver Code Ends
//
//
//class Solution {
//
//    // Function to return length of longest subsequence of consecutive integers.
//    public int longestConsecutive(int[] arr) {
//        // code here
//        int n=arr.length;
//        if(n==0){
//            return 0;
//        }
//        int longest=1;
//        Set<Integer> s=new HashSet<>();
//        for(int i=0;i<n;i++){
//            s.add(arr[i]);
//        }
//        for(int i:s){
//            if(!s.contains(i-1)){
//                int  current=1;
//                int x=i;
//                while(s.contains(x+1)){
//                    x=x+1;
//                    current=current+1;
//                }
//                longest=Math.max(longest,current);
//
//            }
//        }
//        return longest;
//    }
//}