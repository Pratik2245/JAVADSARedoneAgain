package dsaQuestionsByAmazonGoogleFacebook;

public class leet_rotatedBinarysearch {
    public static void main(String[] args) {
        int res=search();
        System.out.println(res);
    }
    public static int search(){
        int nums[]={4,5,7,8,9,0,1,2,3};
        int target=5;
        int pivot=findPivot(nums);
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
//        System.out.println("pivot"+pivot);
        if(nums[pivot]==target){
            return pivot;
        }
       if(target>=nums[0]){
           return binarySearch(nums,target,0,pivot);
       }
        return binarySearch(nums,target,pivot+1,nums.length-1);
//        System.out.println(second);
//        return second;
    }
    public static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while (start<=end){
            mid=(start+end)/2;
            //4 cases
            //case 1 but it can be possible that mid can be end and it cannot compare it with mid+1 so we add one more condition
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //case 3
            if (arr[start]>=arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
            return -1;
    }
    //binary search
    public static int binarySearch(int[] arr,int element,int start,int end){
        int mid = 0;
        while (start<=end){
            mid = (start + end) / 2;
            if (arr[mid] == element) {
                return mid;

            } else if (arr[mid] < element) {
                start = mid + 1;
            } else if (arr[mid] > element) {
                end=mid-1;
            }


        }
        return -1;
    }
}
