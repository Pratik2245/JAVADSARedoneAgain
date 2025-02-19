package ProblemsOnStack;

import java.util.Stack;

public class Stack_01PushAtBottom {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int topData=s.pop();
        pushAtBottom(s,data);
        s.push(topData);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(29);
        s.push(45);
        pushAtBottom(s,4);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
