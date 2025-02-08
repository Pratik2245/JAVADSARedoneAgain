public class Arr_2LinearSearchWithRecurrsion {
    public static void main(String[] args) {
        int[] arr={2,5,4,6,1};
        int target=5;
//        boolean ans=LinearSearch(arr,target,0);
        int ans=LinearSearch(arr,target,0);
        System.out.println(ans);
    }
//    public static  boolean LinearSearch(int arr[],int target,int index){
//        if(index==arr.length-1){
//            return false;
//        }
//        return arr[index]==target || LinearSearch(arr,target,index+1);
//    }
    public static  int LinearSearch(int arr[],int target,int index){
        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return LinearSearch(arr,target,index+1);
    }
}
