public class Pattern_3_SelectionSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};

        SelectionSort(arr,0,0,0);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void SelectionSort(int arr[],int row,int col,int min){
        if(row==arr.length-1){
            return;
        }
        if(col<arr.length-1) {
            if (arr[min] > arr[col + 1]) {
                min = arr[col + 1];

            }
            SelectionSort(arr,row,col+1,min);
        }
        else {
            int temp=arr[row];
            arr[row]=arr[min];
            arr[min]=temp;
            SelectionSort(arr,row+1,row+2,row+1);
        }
    }

}
