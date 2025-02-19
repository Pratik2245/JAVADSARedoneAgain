package ProblemsOnStack;

import java.util.Stack;

public class Stack_03ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(12);
        s.push(34);
        s.push(56);
        s.push(67);
        ReverseAStack(s);
        while (!s.isEmpty()){
            System.out.println( s.pop());
        }
    }
    public static void ReverseAStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int data=s.pop();
        ReverseAStack(s);
        s.push(data);
    }
}
