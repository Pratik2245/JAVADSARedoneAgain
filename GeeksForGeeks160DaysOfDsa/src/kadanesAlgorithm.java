public class kadanesAlgorithm {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int sum= kanadeAlgorithm(arr);
        System.out.println(sum);
    }
    public static int kanadeAlgorithm(int arr[]){
        int currentSum=0;
        int ans=arr[0];
//        when negative comes then currentSum will be 0
        for (int i = 0; i <arr.length ; i++) {
            currentSum=currentSum+arr[i];
            ans=Math.max(ans,currentSum);
            if(currentSum<0){
                currentSum=0;
            }
        }
        return ans;
    }
}
