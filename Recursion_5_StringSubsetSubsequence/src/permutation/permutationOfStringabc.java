package permutation;

public class permutationOfStringabc {
    public static void main(String[] args) {
        String a="abc";
        findPermutation("",a);
    }
    public static void findPermutation(String a,String up){
        if(up.isEmpty()){
            System.out.println(a);
            return;
        }
        char s=up.charAt(0);
        for (int i = 0; i <=a.length() ; i++) {
            String f=a.substring(0,i);
            String s1=a.substring(i,a.length());
            findPermutation(f+s+s1,up.substring(1));
        }
    }
}
