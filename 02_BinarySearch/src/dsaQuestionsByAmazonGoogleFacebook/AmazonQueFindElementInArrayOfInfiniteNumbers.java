package dsaQuestionsByAmazonGoogleFacebook;

public class AmazonQueFindElementInArrayOfInfiniteNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 9, 15, 17, 19};
        int start = 0;
        int end = 0;
        
        int mid = 0;
        boolean found=false;
        int element = 155;
        for (int i=start;i<=end;i++){
            mid = (start + end) / 2;
            if (arr[mid] == element) {
                System.out.println("element found at index =" + mid);
                found=true;
                break;
            } else if (arr[mid] < element) {
                start = mid + 1;
            } else if (arr[mid] > element) {
                end=mid-1;
            }
        }
        if (found==false){
            System.out.println("element not found");
        }
    }
}
