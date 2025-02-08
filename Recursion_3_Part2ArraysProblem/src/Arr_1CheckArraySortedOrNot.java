public class Arr_1CheckArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,3,9,4,5,6};
        boolean b=checkSorted(arr,0);
        System.out.println(b);
    }
//    check weather the array is sorted or not using recursion
    public static  boolean checkSorted(int arr[],int count){
            if(count==arr.length-1){
                return true;
            }
            return arr[count]<arr[count+1] && checkSorted(arr,count+1);
    }
}