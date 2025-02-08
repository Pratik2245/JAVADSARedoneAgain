public class LeetCode_28FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
      int ans=  strStr("sadbutsad","sad");
        System.out.println(ans);
    }
    public static int strStr(String haystack, String needle) {
     int ans=-1;
     char ch=needle.charAt(0);
        for (char m:needle.toCharArray()) {
        for (char c:haystack.toCharArray()) {
            System.out.println(c);
            if(m==c){
            }
        }
        }
     return ans;
    }
}
