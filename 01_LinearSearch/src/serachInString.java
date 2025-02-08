import java.util.Scanner;

public class serachInString {
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
        String s1="pratik";
        String s="k";
//        int result=searchString(s1,s);
        int result=searchString(s1,s,1,4);
        if (result==-1){
            System.out.println("charcter not found");
        }else{
            System.out.println("charcter  found at loaction "+result);
        }
    }
//    public static int searchString(String s1,String s){
//        for (int i = 0; i <s1.length(); i++) {
//            char c=s.charAt(0);
//            if (c==s1.charAt(i)){
//             return i;
//            }
////            System.out.println(s1.charAt(i));
//        }
//        return  -1;
//    }
//searching in range
    public static int searchString(String s1,String s,int start,int end){
    for (int i = start; i <=end; i++) {
        char c=s.charAt(0);
        if (c==s1.charAt(i)){
            return i;
        }
//            System.out.println(s1.charAt(i));
    }
    return  -1;
}
}
