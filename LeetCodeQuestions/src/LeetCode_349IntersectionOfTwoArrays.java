import java.util.HashSet;
import java.util.Set;

public class LeetCode_349IntersectionOfTwoArrays {
    public static void main(String[] args) {
      int arr1[]={1,2,2,3};
      int arr2[]={2,3};
      intersection(arr1,arr2);
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for(int num:nums1){
            set1.add(num);
        }

        for (int i:nums2) {
            if (set1.contains(i)){
                resultSet.add(i);
            }
        }
        int res[]=new int[resultSet.size()];
        int i=0;
        for(int ans:resultSet){
           res[i++]=ans;
        }
        return res;
    }
}
