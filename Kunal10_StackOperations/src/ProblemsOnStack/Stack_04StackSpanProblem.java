package ProblemsOnStack;

import java.util.Arrays;
import java.util.Stack;

public class Stack_04StackSpanProblem {
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,85,100};
//        [0, -1, 0, 0, 2, -1, -1]
        stackSpan(arr);
    }
    public static void stackSpan(int[] arr){
        int span[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        s.push(0);
        span[0]=1;
        int i;
        for (i=1; i <arr.length ; i++) {
            int current=arr[i];
        while (!s.isEmpty() && arr[s.peek()]<current) {
            s.pop();
        }
        if(s.isEmpty()){
            span[i]=i+1;
        }else {
            int prevHigh = s.peek();
            span[i] = i - prevHigh;

        }
            s.push(i);
        }
        System.out.println(Arrays.toString(span));
    }
}
