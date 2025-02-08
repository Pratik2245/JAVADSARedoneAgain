public class Recursion_3_BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int arr[]={1,2,99,88,4,5};
        int ans=binarySearch(arr,99,0,arr.length-1);
        System.out.println(ans);
    }
    public static int binarySearch(int arr[],int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]==target){
            return mid;
        } else if (arr[mid]>target) {
          return  binarySearch(arr,target,0,mid-1);
        }
        return binarySearch(arr,target,mid+1,end);
    }
}
