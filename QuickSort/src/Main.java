//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int arr[]={6,3,9,5,2,8,10,11};
     quickSort(arr,0,arr.length-1);
     printArray(arr);
    }
    public static void quickSort(int arr[],int low,int high){
        int pivot=0;
        if(low<high) {
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
          }
        }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low+1;
        int j=high;
        while (i<=j){
            while (i<=high && arr[i]<pivot){//but it should not go beyond the arr length
                i++;
            }
            while (j>=low && arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            int temp=arr[low];
            arr[low]=arr[j];
            arr[j]=temp;

        }
        return j;
    }
    public static void printArray(int arr[]){
        for(int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}