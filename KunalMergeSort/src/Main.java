//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr[]={8,3,4,12,5,6};
        mergeSort(arr,0,arr.length-1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void  mergeSort(int arr[],int start,int end){
        if(start>=end){
            return  ;
        }
        int middle=(start+end)/2;
        mergeSort(arr,start,middle);
        mergeSort(arr,middle+1,end);
        sortArr(arr,start,middle,end);
    }
    public static void sortArr(int arr[],int start,int middle,int end){
        int n1=middle-start+1;
        int n2=end-middle;
        int[] leftArr=new int[n1];
        int[] rightArr=new int[n2];
        for (int i = 0; i <n1 ; i++) {
            leftArr[i]=arr[start+i];
        }
        for (int j = 0; j <n2; j++) {
            rightArr[j]=arr[middle+1+j];
        }
        int i=0,j=0;
        int k = start;
        while (i<leftArr.length && j<rightArr.length){
           if(leftArr[i]<=rightArr[j]){
           arr[k]=leftArr[i];
           i++;
           }else{
               arr[k]=rightArr[j];
               j++;
           }
           k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArr[], if any
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}