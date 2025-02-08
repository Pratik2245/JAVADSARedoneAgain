//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class Day6_MajorityElement {
//    public static void main(String[] args) {
//        int arr[]={2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
//        List<Integer> l=new ArrayList<>();
//        l=findMajority(arr);
//        System.out.println(l);
//    }
//    public static  List<Integer> findMajority(int[] nums) {
//        HashMap<Integer,Integer> map=new HashMap<>();
//        List<Integer> l=new ArrayList<>();
//        int ans=nums.length/3+1;
//        System.out.println(ans);
//        for (int i = 0; i < nums.length ; i++) {
//        map[nums[i]]++;
//        }
//        return l;
//    }
//}
