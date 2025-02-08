import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Stack1_ArrayListOperations {
    public static void main(String[] args) {
     Stack s=new Stack();
     s.push(10);
     s.push(20);
     s.push(34);
     while (!s.isEmpty()) {
         System.out.println(s.pop());
     }
     if(s.isEmpty()){
         System.out.println("Stack is empty");
         throw new IllegalStateException("Stack is empty");
     }
        System.out.println(s.peek());
    }
}
class Stack{
    ArrayList<Integer> arr=new ArrayList<>();
    public boolean isEmpty(){
        return arr.size()==0;
    }
    public void push(int data){
        arr.add(data);
    }
    public int pop(){
        int top = arr.remove(arr.size() - 1);
        return top;
    }
    public int peek(){
        return arr.get(arr.size()-1);
    }
}