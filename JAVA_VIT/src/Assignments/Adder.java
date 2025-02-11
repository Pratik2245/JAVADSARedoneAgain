package Assignments;

import java.util.Arrays;

public class Adder {
    int targetSum;
    int arr2[]=new int[2];
    int size=0;
    int arr[];
    Adder(int size){
        this.size=size;
    }
    public void getData(int[] arr,int targetSum){
        this.arr=arr;
        this.targetSum=targetSum;
    }
    int[] numSum(){
        if (size < 2) {  // Prevent checking when array has <2 elements
            return new int[]{-1, -1};
        }
        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j <size ; j++) {
                if(arr[i] + arr[j] == targetSum){
                    arr2[0]=arr[i];
                    arr2[1]=arr[j];
                    return arr2;
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println("##################First Test Case #######################");
        int target=15;
        int arr[]={3,5,-4,8,11,1,-1,6};
        int size=arr.length;
        Adder a=new Adder(size);
        a.getData(arr,target);
        int[] arr2=a.numSum();
        System.out.println(Arrays.toString(arr2));

        System.out.println("##################Second Test Case #######################");
        int TestCase2[]={3,5,-4,8,11,1,-1,7};
        int size2=TestCase2.length;
        int targetSum=15;
        Adder a1=new Adder(size2);
        a1.getData(TestCase2,targetSum);
        int newArr[]=a1.numSum();
        System.out.println(Arrays.toString(newArr));
        }
}
