public class LeetCode_3110ScoreofaString {
    public static void main(String[] args) {
        String s="hello";
        int ans=scoreOfString(s);
        System.out.println(ans);
    }
    public static int scoreOfString(String s) {
        int score=0;
        for (int i = 1; i <s.length() ; i++) {
            int char1=s.charAt(i);
            int char2=s.charAt(i-1);
            System.out.println(char1);
            System.out.println(char2);
            score+=Math.abs(char1-char2);

        }
        return score;
    }
}
