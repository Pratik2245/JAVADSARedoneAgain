//import java.util.Arrays;
//
//public class LeetCode_88MergeSortedArray {
//    public static void main(String[] args) {
//        int arr[]={1,4,8,9,0,0,0};
//        int arr2[]={3,5,10};
//        merge(arr,arr.length,arr2,arr2.length);
//    }
//        public static void merge(int[] nums1, int m, int[] nums2, int n) {
//            // Start from the end of nums1 and nums2
//            int i = m - 1; // Last element of the valid part of nums1
//            int j = n - 1; // Last element of nums2
//            int k = m + n - 1; // Last position in nums1
//
//            // Merge nums1 and nums2 from the end
//            while (i >= 0 && j >= 0) {
//                if (nums1[i] > nums2[j]) {
//                    nums1[k--] = nums1[i--];
//                } else {
//                    nums1[k--] = nums2[j--];
//                }
//            }
//
//            // Copy any remaining elements from nums2
//            while (j >= 0) {
//                nums1[k--] = nums2[j--];
//            }
//
//            // Remaining elements in nums1 are already in place
//        }
//    }
//
