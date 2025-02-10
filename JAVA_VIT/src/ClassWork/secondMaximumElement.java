package ClassWork;

import java.util.Arrays;

public class secondMaximumElement {

    public static void main(String[] args) {
        int arr[]={5,4,3,9,8};
        int largest=arr[0];
        int secondSmallest=0;
        int thirdSmallest=0;
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-2]);
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>largest){
            secondSmallest=largest;
            largest=arr[i];
            }else if(secondSmallest<arr[i])
            {
                secondSmallest=arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondSmallest);
    }
}
