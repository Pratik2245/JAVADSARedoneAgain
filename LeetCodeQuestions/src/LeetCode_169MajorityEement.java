public class LeetCode_169MajorityEement {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
           max= Math.max(arr[i],max);
        }
        System.out.println(max);
    }
}
