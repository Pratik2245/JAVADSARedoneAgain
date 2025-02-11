package ClassWork;

public class MaximumSubArray {
    public static void main(String[] args) {
//        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int arr[]={5,4,-1,7,8};
        int ans=arr[0];
        int currentSum=0;
        for (int i = 0; i <arr.length ; i++) {
            if(currentSum<0){
                currentSum=0;
            }
            currentSum=currentSum+arr[i];
            ans=Math.max(currentSum,ans);

        }
        System.out.println(ans);
    }
}
