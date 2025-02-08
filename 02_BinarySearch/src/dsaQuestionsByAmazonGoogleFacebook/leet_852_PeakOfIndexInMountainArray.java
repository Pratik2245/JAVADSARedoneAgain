package dsaQuestionsByAmazonGoogleFacebook;

public class leet_852_PeakOfIndexInMountainArray {
    public static void main(String[] args) {
    int finalRes=search();
        System.out.println(finalRes);
    }
    public static int search(){
        int[] arr={1,2,3,4,5,6,7,100,9,10,11};
        int target=10;
        int result= peakIndexInMountainArray(arr);
        int firstTry=binarySearch(arr,target,0,result);
        if (firstTry!=-1){
            return firstTry;
        }
        //else try in second part
        int second=orderAgnosticBinarySearch(arr,target,result+1,arr.length);
        return second;
//        System.out.println(result);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;//gives 9
        int mid = 0;
      while (start<end) {
          mid = (start + end) / 2;
          if (arr[mid] > arr[mid + 1]) {
              end = mid;
          } else if (arr[mid] < arr[mid + 1]) {
              start = mid +1;
          }

      }
      return start;
    }
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
