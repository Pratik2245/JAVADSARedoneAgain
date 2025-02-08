//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] arr={{1,4,7},{10,14,17},{20,21,26}};
        int target=21;
//        int res=findIn2D(arr,target);
//        System.out.println(res);
        findElement(arr,target);

    }
//    public static int findIn2D(int[][] arr,int target){
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//                int mid=0;
//                int start=0;
//                int end=arr[i].length-1;
//                while (start<=end){
//                    mid=(start+end)/2;
//                    if(arr[i][mid]==target){
//                        return mid;
//                    }
//                }
//            }
//            System.out.println();
//        }
//        return -1;
//    }
   public static void findElement(int[][] arr ,int target){
       for (int i = 0; i <arr.length ; i++) {
           for (int j = 0; j < arr[i].length; j++) {
               int start=0;
            int mid=0;
            int end=arr[i].length-1;

            if(arr[i].length-1 < target){
                i++;
            }
            System.out.println("End="+arr[i][end]);
         while (start<=end){
                mid=(start+end)/2;
                if(arr[i][mid]==target){
                    System.out.println("ELement found at location="+i+" "+mid);
                    return;
                } else if (arr[i][mid] > target) {
                   end=mid-1;
                }else{
                    start=mid+1;
                }
         }
           }
       }

   }
}