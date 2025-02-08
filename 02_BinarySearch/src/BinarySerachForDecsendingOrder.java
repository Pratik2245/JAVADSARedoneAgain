public class BinarySerachForDecsendingOrder {
    public static void main(String[] args) {

        int[] arr = {19, 17, 15, 9, 8, 7, 6, 5, 3,1};
        int start = 0;
        int end = arr.length-1;
        int element = 1;
        int result=orderAgnosticBinarySearch(arr,start,end,element);
        System.out.println(result);
    }
    public static int orderAgnosticBinarySearch(int arr[],int start,int end,int element){//gives 9
        int mid = 0;
      while (start<=end){
            mid = (start + end) / 2;
            if (arr[mid] == element) {
                return  mid;
            } else if (arr[mid] < element) {
                end = mid - 1;
            } else if (arr[mid] > element) {
                start=mid+1;
            }
        }
      return -1;
    }

}
