public class LeetCode_14LongestCommonPrefix {
    public static void main(String[] args) {
        String[]  strs = {"flower","flow","flight"};
        for (int i = 0; i <strs.length ; i++) {
            for (int j = 0; j <strs[i].length() ; j++) {
                System.out.println(strs[i].charAt(j));
            }
        }
    }
}
