public class StockBuyAndSellMaxInOneTansitionEasy {
    public static void main(String[] args) {
        int arr[]={6,9,5,3,2,6,6,4};
        int ans=maximumProfit(arr);
        System.out.println(ans);
    }
    public  static  int maximumProfit(int prices[]) {
        if(prices==null || prices.length<2){
            return 0;
        }
        int minprice=prices[0];
        int maxprice=0;
        for (int i = 1; i <prices.length ; i++) {
            maxprice=Math.max(maxprice,prices[i]-minprice);
            minprice=Math.min(minprice,prices[i]);
        }
        return maxprice;
    }
}
