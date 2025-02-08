public class Pattern_2_BubbleSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int row=0,col=0;
        BubbleSort(arr,row,col);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void BubbleSort(int arr[],int row,int col){
        if(row==arr.length-1){
            return;
        }
        if(col<arr.length-1-row){
        if(arr[col]>arr[col+1]) {
            int temp = arr[col];
            arr[col] = arr[col + 1];
            arr[col + 1] = temp;
        }
            BubbleSort(arr,row,col+1);
        }else{
            BubbleSort(arr,row+1,0);
        }
        

    }
}
