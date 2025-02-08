public class LeetCode_121BestTimetoBuyAndSellStock {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
//        int arr[]={7,6,4,3,1};
        int profit=SellBuy(arr);

        System.out.println(profit);
    }
    public static int SellBuy( int arr[]){
        int profit=0;
        int buy=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<buy){
                buy=arr[i];
            }else if(arr[i]-buy>profit){
                profit=arr[i]-buy;
            }
        }
        return profit;
    }
}
