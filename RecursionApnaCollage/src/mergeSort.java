public class mergeSort {
    public static void mergeSort1(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        // Recursively sort the first half
        mergeSort1(arr, start, mid);
        // Recursively sort the second half
        mergeSort1(arr, mid+1, end);
        //merge the sorted arrays
        merge(arr,start,mid,end);
    }
    public static void merge(int arr[],int start,int mid,int end){
        // left(0,3) total 4 eleents so +1
        int temp[]=new int[end-start+1];
        int i=start;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temp array
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        while (i<=mid) {
            temp[k]=arr[i];
            k++;
            i++;
        }
        while (j<=end) {
            temp[k]=arr[j];
            k++;
            j++;
        }
        for (int k2 = 0; k2 < temp.length; k2++) {
            arr[start+k2]=temp[k2];
        }
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

            public static void main(String[] args) {
                int arr[]={6,3,9,5,2,8};
                mergeSort1(arr, 0, arr.length-1);
                printArray(arr);
            }

    }

