public class LeetCode_169MajorityElement {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("printing the array");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
