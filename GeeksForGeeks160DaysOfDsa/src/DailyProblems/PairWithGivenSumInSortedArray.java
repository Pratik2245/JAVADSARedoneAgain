package DailyProblems;

public class PairWithGivenSumInSortedArray {
    public static void main(String[] args) {
        int arr[]={-1,1,5,5,7};
        int ans=countPairs(arr,6);
        System.out.println(ans);
    }
    public static int countPairs(int arr[], int target) {
//        int sum=0;
//        int count=0;
//        int left=0;
//        int right=arr.length-1;
//        while (left<right){
//            sum=arr[left]+arr[right];
//            if(sum==target){
//                count++;
//                left++;
//                right--;
//            }else if(sum<target){
//                left++;
//            }else{
//                right--;
//            }
//        }
//        return count;
        int left = 0, right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                if (arr[left] == arr[right]) {
                    // Handle case where elements are the same
                    int freq = right - left + 1;
                    count += freq * (freq - 1) / 2; // Combination formula
                    break;
                } else {
                    // Count duplicates on the left
                    int leftCount = 1;
                    while (left + 1 < right && arr[left] == arr[left + 1]) {
                        leftCount++;
                        left++;
                    }

                    // Count duplicates on the right
                    int rightCount = 1;
                    while (right - 1 > left && arr[right] == arr[right - 1]) {
                        rightCount++;
                        right--;
                    }

                    count += leftCount * rightCount;
                    left++;
                    right--;
                }
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}
