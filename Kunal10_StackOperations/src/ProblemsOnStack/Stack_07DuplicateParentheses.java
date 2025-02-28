package ProblemsOnStack;

import java.util.Stack;

public class Stack_07DuplicateParentheses {
    public static void main(String[] args) {
        String s="((a+b)+(c+d))";
        boolean ans=duplicateParentheses(s);
        System.out.println(ans);
    }
    public static boolean duplicateParentheses(String s){
        char ch[]=s.toCharArray();
        int i=0;
        int count=0;
        Stack<Character> stack=new Stack<>();
        while(i<ch.length){
            if(ch[i] ==')'){
                count=0;
                while (!stack.isEmpty() && stack.peek()!='('){
                    stack.pop();
                    count++;
                }
                if(count==0){
                    return true;
                }
                stack.pop();
            }else{
                stack.push(ch[i]);
            }
            i++;
        }
        System.out.println(stack);
        return false;
    }
}
