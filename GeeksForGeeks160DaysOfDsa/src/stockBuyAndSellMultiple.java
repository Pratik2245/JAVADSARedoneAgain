public class stockBuyAndSellMultiple {
    public static void main(String[] args) {
        int arr[]={4, 2, 2, 2, 4};
        int ans=MultipleTransations(arr);
        System.out.println(ans);
    }

    private static int MultipleTransations(int[] arr) {
        int ans=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[i-1]){
                ans+=arr[i]-arr[i-1];
            }
        }
        return ans;
    }
}
