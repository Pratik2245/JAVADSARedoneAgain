public class MissingNumberCyclicSort {
    public static void main(String[] args) {
        int result=MissingNUmberCyclicSort();
        System.out.println(result);

    }
    public static int MissingNUmberCyclicSort(){
        int[] arr={3,1,2,0,4};
        int i=0;
        while (i<arr.length){
            int correct=arr[i];
            if(arr[i]< arr.length && arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j] != j){
                return j;
            }

        }
        return arr.length;
    }
}
