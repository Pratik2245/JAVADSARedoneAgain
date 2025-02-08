public class Recursion_6FirstOccurenceOfElementInArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,5,5,5};
//        int index=Occurence(arr,5,arr.length-1);
        int index1=lastOccurence(arr,5,arr.length-1);
        System.out.println(index1);
    }

    private static int Occurence(int[] arr, int key, int i) {
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
        return i;
         }
        return Occurence(arr,key,i+1);
    }
    private static int lastOccurence(int[] arr, int key, int i) {
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccurence(arr,key,i-1);
    }
}
