package dsaQuestionsByAmazonGoogleFacebook;

public class floorOfANumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int start = 0;
        int end = arr.length-1;//gives 9
        int mid = 0;
        boolean found=false;
        int element = 19;
//        loop will go until start is equal or less and end at start greater than end
        while (start<=end){
            mid = (start + end) / 2;

            if (element>arr[arr.length-1]){
                System.out.println("Number does not exists");
                return;
            }
//            System.out.println("mid="+mid);
            if (arr[mid] == element) {
                System.out.printf("Floor of %d is= %d",element,arr[mid]);
                found=true;
                break;
            } else if (arr[mid] < element) {
                start = mid + 1;
            } else if (arr[mid] > element) {
                end=mid-1;
            }

        }
        if (found==false){
            System.out.printf("Floor of %d is= %d",element,arr[end]);
        }
    }
}
