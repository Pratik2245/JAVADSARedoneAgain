//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BubbleSort {
    public static void main(String[] args) {
        boolean swap=false;
     //bubble sort
     int arr[]={10,3,2,1,5,4,7,11,13,0};
//     int arr[]={1,2,3,4,5,6};
////        System.out.println(arr.length);
//        for (int i = 0; i <arr.length; i++) {
//            for (int j = 0; j <arr.length-1-i ; j++) {
//               if (arr[j]>arr[j+1]){
//                   int temp=arr[j];
//                   arr[j]=arr[j+1];
//                   arr[j+1]=temp;
//                   swap=true;
//               }
//            }
//            if (!swap){
//                break;
//            }
//        }
////        //printing array after sorting
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
              if(arr[j]>arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }
            }
            System.out.println("array after pass:"+i);
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(" "+arr[j]);
            }
            System.out.println();
        }
        System.out.println("sorted array is =");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}