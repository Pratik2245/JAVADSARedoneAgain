package Collections;

import java.util.*;

public class ArrayArrayList {
    public static void main(String[] args) {
//        int arr[]={1,2,4,5};
//        List<Integer> list=new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(4);
//         list.add(5);
//        System.out.println(list);
//       list.remove(2);
//       list.remove(3);
//        System.out.println(list);

        LinkedList<Integer> linkedList=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber of Elements to Insert In the Linked List: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for (int i = 0; i <n; i++) {
            System.out.println("Enter the "+i+" Element");
            int ans=sc.nextInt();
            arr[i]=ans;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            linkedList.add(i,arr[i]);
        }
        System.out.println("Sorted Linked List="+linkedList);


        //second way
        LinkedList<Integer> newLinkedList=new LinkedList<>();
        newLinkedList.add(16);
        newLinkedList.add(18);
        newLinkedList.add(14);
        newLinkedList.add(15);
        newLinkedList.add(20);
        Collections.sort(newLinkedList);
        System.out.println("sorted Linked list="+newLinkedList);
    }
}
