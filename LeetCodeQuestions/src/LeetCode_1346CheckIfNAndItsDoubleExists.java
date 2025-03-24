import java.util.HashSet;

public class LeetCode_1346CheckIfNAndItsDoubleExists {
    public static void main(String[] args) {
        int arr[]={10,2,5,3};
        boolean b=checkIfExist(arr);
        System.out.println(b);
    }
    public static boolean checkIfExist(int[] arr) {
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(i!=j && (arr[i])==(arr[j]*2))
//                {
//                    return true;
//                }
//            }
//        }
//        return false;
//        using hashset
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i:arr){
            if(hashSet.contains(i*2)|| (i%2==0 && hashSet.contains(i/2))){
                return true;
            }
            hashSet.add(i);
        }
        return false;
    }

//    class Solution {
//        public boolean checkIfExist(int[] arr) {
//            boolean[] freq = new boolean[2001];
//
//            for (int i = arr.length - 1; i >= 0; i--) {
//                if (arr[i] % 2 == 0 && freq[arr[i] / 2 + 1000]) {
//                    return true;
//                } else if (arr[i] >= -500 && arr[i] <= 500 && freq[arr[i] * 2 + 1000]) {
//                    return true;
//                }
//
//                freq[arr[i] + 1000] = true;
//            }
//
//            return false;
//        }
//
//    }
}
