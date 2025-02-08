public class LeetCode_09PalindromeNumber {
    public static void main(String[] args) {
        int x=121;
        boolean result=isPalindrome(x);
        if (result) {
            System.out.println("no is palindrome");
        }else {
            System.out.println("no is not palindrome");
        }
    }
    public static  boolean isPalindrome(int x){
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