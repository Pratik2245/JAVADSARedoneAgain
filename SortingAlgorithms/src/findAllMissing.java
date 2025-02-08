public class findAllMissing {
    public static void main(String[] args) {
        int arr[]={3,3,3,3,3};
        findAllMissingNumbers(arr);
    }
    public static void findAllMissingNumbers(int arr[]){
        int i=0;
        int index;
        while (i<arr.length){
            index=arr[i]-1;
            if(arr[i]!=arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }else {
                i++;
            }
        }
        //printing the array
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
