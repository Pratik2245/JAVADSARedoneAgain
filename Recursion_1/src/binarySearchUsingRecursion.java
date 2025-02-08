public class binarySearchUsingRecursion {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,10,11};
        int target=10;
        int ans=BinarySearch(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    public static  int BinarySearch(int arr[],int target,int start,int end){
    if(start>end){
        return  -1;
    }
    int mid=(start+end)/2;
    if(arr[mid]==target){
        return mid;
    }
    if(arr[mid]>target){
        return BinarySearch(arr,target,start,mid-1);
    }
    return BinarySearch(arr,target,mid+1,end);
    }
}
