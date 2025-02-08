import javax.swing.*;
import java.util.Objects;

public class LeetCode_20ValidParenthesis {

    public static void main(String[] args) {
        String s="{}";
        validPrenthesis(s);
}
    public static boolean validPrenthesis(String s) {
//        System.out.println(s);
        String arr[]=s.split("");
        int sq=0;//[
        int curly=0;//{
        int par=0;//(
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                System.out.println();
//                if((arr[i]==arr[j])){
//                    System.out.println("arr[i]"+arr[i]);
//                    System.out.println("arr=[j]"+arr[j]);
//                }
            }
        }
        return true;
    }
}
