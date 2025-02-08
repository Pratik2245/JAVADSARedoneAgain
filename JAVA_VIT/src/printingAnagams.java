import java.util.Arrays;

public class printingAnagams {
    public static void main(String[] args) {
        String s="silent";
        String s2="listen";
       boolean b= FindAnagrams(s,s2);
        System.out.println(b);

    }
    public static boolean FindAnagrams(String s,String s2){
        char arr1[]=s.toCharArray();
        char arr2[]=s2.toCharArray();
        int lenght1=arr1.length;
        int lenght2=arr2.length;
        if(lenght1!=lenght2){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i <lenght1 ; i++) {
         if(arr1[i]!=arr2[i]){
             return false;
         }
        }
        return true;
    }
}
