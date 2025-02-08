public class LeetCode_ReverseNumber {
    public static void main(String[] args) {
        int num=-123;
        int ans=reverse(num);
        System.out.println(ans);
    }
    public static int reverse(int x) {
        int num=x;
        int sum=0;
        int rev=0;
        while(x!=0){
            int rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
        }
        return rev;
    }
}
