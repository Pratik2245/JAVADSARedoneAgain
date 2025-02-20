public class LeetCode_441ArrangingCoins {
    public static void main(String[] args) {
        int n=5;
        arrangeCoins(n);
    }
    public static int arrangeCoins(int n) {
       int count=0;
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        return -1;
    }
}
