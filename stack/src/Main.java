import java.util.Scanner;

import static java.lang.System.exit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final int size=5;
    public static int top=-1;
    public static int arr[]=new int[size];

    public static void main(String[] args) {

        int choice;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Exit");
            System.out.println("4.Dispay");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to insert in the stack");
                    int data = sc.nextInt();
                    insertInStack(data);
                    break;
                case 2:
                    int deleted= deleteFromStack();
                    System.out.println(deleted);
                    break;
                case 3:
                    exit(0);
                    break;
                case 4:
                    display();
                    break;
            }
        }while (choice!=3);

    }
    public static void insertInStack(int data){
        if(top==arr.length-1){
            System.out.println("Stack OverFlow");
            return;
        }
        top++;
        arr[top]=data;
        System.out.println("top="+top);
    }
    public static int deleteFromStack(){
        System.out.println("Top="+top);
        if(top==-1){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int elementDeleted=arr[top];
        top--;
        return elementDeleted;
    }
    public static void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) { // Display only valid elements
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}