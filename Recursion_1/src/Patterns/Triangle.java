package Patterns;

public class Triangle {
    public static void main(String[] args) {
//        triangle(4,0);
//        triangleOriginal(4,0);
        int arr[]={4,3,2,1};
        bubbleSort(arr,arr.length-1,0);
        printArray(arr);
    }
    public static void printArray(int arr[])
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int arr[],int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]>arr[col+1]){
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            bubbleSort(arr,row,col+1);
        }else {
            bubbleSort(arr,row-1,0);
        }
    }
    public static  void triangle(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("*");
            triangle(row,col+1);
        }else {
            System.out.println();
            triangle(row-1,0);
        }
    }
    public static  void triangleOriginal(int row,int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            triangleOriginal(row, col + 1);
            System.out.print("*");
        } else {
            triangleOriginal(row - 1, 0);
            System.out.println();
        }
    }
}
