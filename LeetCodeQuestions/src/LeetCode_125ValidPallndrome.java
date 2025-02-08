public class LeetCode_125ValidPallndrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        boolean ans=validePalindrome(s);
        System.out.println(ans);
    }
    public static boolean validePalindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]",""); //So, it replaces everything that is not a lowercase letter or digit
        // with an empty string (""), effectively removing it.
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
