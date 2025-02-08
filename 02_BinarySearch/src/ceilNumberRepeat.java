import java.util.Scanner;

public class ceilNumberRepeat {
    public static void main(String[] args) {
        int arr[]={2,3,5 ,9,14,16,18,15};
        Scanner sc =new Scanner(System.in);
        int target=sc.nextInt();
        boolean found=false;
        boolean foundFloor=false;
        findCeilNumber(arr,0,arr.length-1,target,found,foundFloor);
    }
    static  void findCeilNumber(int arr[],int  start,int end,int target,boolean found,boolean foundFloor){
        while (start<=end){
            int mid=(start+end)/2;
             if (arr[mid]==target){
                 System.out.println("element found");
                 found=true;
                 foundFloor=true;
                 break;
             } else if (arr[mid]>target) {
                 end=mid-1;
             } else if (arr[mid]<target) {
                 start=mid+1;
             }
        }
        if(found==false){
            System.out.println("ceiling of a number is ="+arr[start]);
        }

        if(foundFloor==false){
            System.out.println("floor of the number is="+arr[end]);
        }
    }
}
//the logoc is simple we will search until the start and end both get crossed then we will get the
//        start as ceiling number and we will print it and if not then we will get the number that is the target one
