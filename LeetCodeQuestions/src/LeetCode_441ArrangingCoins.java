public class LeetCode_441ArrangingCoins {
    public static void main(String[] args) {
        int n=8;
       int ans= arrangeCoins(n);
        System.out.println(ans);
    }
    public static int arrangeCoins(int n) {
//       int ans=0;
//        for (int j = 1; j <=n ; j++) {
//            n=n-j;
//            ans++;
//            if(n<0){
//                break;
//            }
//        }
//        System.out.println(ans);
//        another solution

        int res=0;
        int start=1,end=n;
        while (start<=end){
            int mid = start + (end - start) / 2; // Corrected mid calculation
            long coins = (long) mid * (mid + 1) / 2;
            if(coins>n){
                end=mid-1;
            }else{
                start=mid+1;
                res=Math.max(mid,res);
            }
        }
        return res;

    }
}
