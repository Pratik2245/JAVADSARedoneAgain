public class LeetCode_1480RunningSumof1DArray {
    public static void main(String[] args) {
//        int arr[]={1,2,3,4};
        int arr[]={1,1,1,1,1};
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            arr[i]=sum;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
