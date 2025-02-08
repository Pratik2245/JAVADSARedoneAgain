//package dsaQuestionsByAmazonGoogleFacebook;
//
//// Assuming this is a test implementation or main class
//public class leet_1095_MountainArray {
//
//    public static void main(String[] args) {
//        // Create a test instance of MountainArray
//        // Normally, you would have the actual MountainArray implementation or mock it.
//        // For demonstration, we will use a dummy implementation below.
//
//        MountainArray mountainArr = new MountainArray() {
//            private int[] data = {1, 3, 8, 12, 4, 2}; // Example mountain array
//
//            @Override
//            public int get(int index) {
//                return data[index];
//            }
//
//            @Override
//            public int length() {
//                return data.length;
//            }
//        };
//
//        // Test findInMountainArray method
//        int target = 4;
//        int result = findInMountainArray(target, mountainArr);
//        System.out.println("Index of target " + target + ": " + result); // Expected index: 4
//    }
//
//    public static int findInMountainArray(int target, MountainArray mountainArr) {
//        int peakIndex = peakIndexInMountainArray(mountainArr);
//
//        // Search in the increasing part of the mountain array
//        int firstTry = binarySearch(mountainArr, target, 0, peakIndex, true);
//        if (firstTry != -1) {
//            return firstTry;
//        }
//
//        // Search in the decreasing part of the mountain array
//        return binarySearch(mountainArr, target, peakIndex + 1, mountainArr.length() - 1, false);
//    }
//
//    public static int peakIndexInMountainArray(MountainArray arr) {
//        int start = 0;
//        int end = arr.length() - 1;
//
//        while (start < end) {
//            int mid = (start + end) / 2;
//            if (arr.get(mid) > arr.get(mid + 1)) {
//                end = mid; // Peak is to the left, including mid
//            } else {
//                start = mid + 1; // Peak is to the right, excluding mid
//            }
//        }
//
//        return start;
//    }
//
//    // Perform binary search in a specific direction
//    public static int binarySearch(MountainArray arr, int target, int start, int end, boolean isAscending) {
//        while (start <= end) {
//            int mid = (start + end) / 2;
//            int midValue = arr.get(mid);
//
//            if (midValue == target) {
//                return mid;
//            }
//
//            if (isAscending) {
//                if (midValue < target) {
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            } else {
//                if (midValue < target) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//        }
//
//        return -1;
//    }
//}
