import jdk.jshell.execution.JdiDefaultExecutionControl;

public class LeetCode_88PlusOne {
    public static void main(String[] args) {

        int arr[]={9};
        arr=plusOne(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] plusOne(int[] digits) {

    for (int i = digits.length-1; i >=0 ; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
    }
    int[] newArr=new int[digits.length+1];
    newArr[0]=1;
    return newArr;
    }
}
