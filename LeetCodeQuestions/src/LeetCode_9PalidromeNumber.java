public class LeetCode_9PalidromeNumber {
    public static void main(String[] args) {
     int x=141;
     boolean result=isPalindrome(x);
        System.out.println(result);
    }
    public static boolean isPalindrome(int x) {
        int num=x;
        int reverse=0;
        int dig=0;
        while(x>0){
            reverse=(reverse*10)+x%10;
            x=x/10;
        }
        return (reverse==num);
    }
}
