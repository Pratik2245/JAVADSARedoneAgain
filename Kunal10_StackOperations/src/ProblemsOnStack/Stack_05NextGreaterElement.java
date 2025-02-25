package ProblemsOnStack;

import java.util.Arrays;
import java.util.Stack;

public class Stack_05NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        nextGreater(arr);
    }
    public static void nextGreater(int arr[]){
        Stack<Integer> stack=new Stack<>();
        int newArr[]=new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            int current=arr[i];
            while (!stack.empty() && arr[stack.peek()]<=current){
                stack.pop();
            }
            if(stack.isEmpty()){
                newArr[i]=-1;
            }else{
                newArr[i]=arr[stack.peek()];
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(newArr));
    }
}
