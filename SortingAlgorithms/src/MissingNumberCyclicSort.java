public class MissingNumberCyclicSort {
    public static void main(String[] args) {
        int[] arr={4,0,2,1};
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i] < arr.length && arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }


        }
        for (int j = 0; j <arr.length ; j++) {
              if(arr[j]!=j){
                  System.out.println("Element not present in array is="+j);
              }
        }
//        return arr.length;
    }
}
