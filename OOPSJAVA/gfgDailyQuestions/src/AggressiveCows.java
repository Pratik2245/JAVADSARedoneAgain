import java.lang.reflect.Array;
import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int arr[]={10, 1, 2, 7, 5};
        int k=3;
        int ans=Cows(arr,k);
    }

    private static int Cows(int arr[],int k) {
        int avg,ans=0;
        Arrays.sort(arr);
        for (int i = 1; i <arr.length-1 ; i++) {
            if(arr[i-1]>arr[i]){
                ans+=arr[i-1]-arr[i];
            }
            if(arr[i-1]==arr[i]+k){
                ans+=arr[i]-arr[i-1];
            }

        }
    }
}
