package ProblemsOnStack;

import java.util.Stack;

public class Stack_06ValidParentheses {
    public static void main(String[] args) {
        String arr="([{}])";
        boolean ans=validParenthesis(arr);
        System.out.println(ans);

    }
    public static boolean validParenthesis(String arr){
        char ch[]=arr.toCharArray();
        Stack<Character> s=new Stack<>();
        int i=0;
        while (i<ch.length){
            if (ch[i] =='(' || ch[i]=='{'|| ch[i]=='[') {
                s.push(ch[i]);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                char top=s.peek();
                if (ch[i]=='}' && top=='{' || ch[i]==']' && top=='[' || ch[i]==')' && top=='(') {
                    s.pop();
                }else{
                    return false;
                }
            }
            i++;
        }
        System.out.println(s);

        return s.isEmpty();
    }
}
