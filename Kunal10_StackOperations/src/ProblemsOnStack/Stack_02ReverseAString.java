package ProblemsOnStack;

import java.util.Stack;

public class Stack_02ReverseAString {
    public static void main(String[] args) {
        String s="pratik";
        ReverseAString(s);
    }
    public static void ReverseAString(String s){
        Stack<Character> ch=new Stack<>();
        char c[]=s.toCharArray();
        int index=0;
        while (index<c.length){
            ch.push(c[index]);
            index++;
        }
        StringBuilder bul=new StringBuilder();
        while (!ch.isEmpty()){
            bul.append(ch.pop());
        }
        System.out.println(bul);
    }
}
