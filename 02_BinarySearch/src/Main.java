
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 9, 15, 17, 19};
        int result=binarySearch(arr);
        System.out.println(result);
    }
    public static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length-1;//gives 9
        int mid = 0;
        int element = 15;
      while (start<=end){
//        for (int i=start;i<=end;i++){
        mid = (start + end) / 2;
//            System.out.println("mid="+mid);
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