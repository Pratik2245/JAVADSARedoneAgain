public class CyclicSort {
    public static void main(String[] args) {
        //cyclic sort
        int[] arr={5,4,3,2,1};
        int i=0;
        while (i<arr.length){
           int value=arr[i]-1;
           if(arr[i]!=arr[value]){
               int temp=arr[i];
               arr[i]=arr[value];
               arr[value]=temp;
//               System.out.println("new vl"+arr[i]);
           }else{
               i++;
           }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
