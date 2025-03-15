public class LeetCode_1528SuffelingString {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,2,1,3};
        String str="codeleet";
        String s=restoreString(str,arr);
        System.out.println(s);
    }
    public static String restoreString(String s, int[] indices) {
       char[] suffeled=new char[s.length()];
        for (int i = 0; i < suffeled.length; i++) {
            suffeled[indices[i]]=s.charAt(i);
        }
        for (int i = 0; i < suffeled.length; i++) {
            System.out.println(suffeled[i]);
        }
        return new String(suffeled);
    }
}
