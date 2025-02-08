package Packages;

public class palindromeOfNumber {
    public static void main(String[] args) {
        int number = 12321;
        int res = number;
        int rev = 0;
        while (number > 0) {
            int rem = number % 10;
            rev = (rev * 10) + rem;
            number = number / 10;
        }
        System.out.println(rev);
        System.out.println(res);
        if (rev == res){
            System.out.println("No is palindrome Number");
        }else {
            System.out.println("Number is not palindrome");
        }
    }
}
