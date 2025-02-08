public class LeetCode_58LengthOfLastWord {
    public static void main(String[] args) {
        String s="moon";
        String new1= s.trim();
        System.out.println(new1);
        int count=0;
        for (int i = new1.length()-1; i >=0 ; i--) {
            if(new1.charAt(i)!=' '){
                count++;
            }else {
                break;
            }
        }
        System.out.println(count);
    }
}
