public class Rec_8_Palindrome {
    public static void main(String[] args) {
     boolean ans=Palindrome(123218);
        System.out.println(ans);
    }
    public static int Reverse(int number,int rev){
        if(number==0){
            return rev;
        }
        return Reverse(number/10,rev*10+(number%10));
    }
    public static boolean Palindrome(int num){
        return (num==Reverse(num,0));
    }
}
