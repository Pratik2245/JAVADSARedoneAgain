import java.util.Arrays;

public class MinimiseTheHeightOfArray {
    public static void main(String[] args) {
        int arr[]={1,8,10,6,4,6,9,1};
        int k=7;
        int ans=Height(arr,k);
        System.out.println(ans);

    }
    public static int Height(int arr[],int k){
        Arrays.sort(arr);
        int ans=arr[arr.length-1]-arr[0];
        int smallest=arr[0]+k;
        int largest=arr[arr.length-1]-k;
        int min,max;
        for (int i = 0; i < arr.length-1; i++) {
            min = Math.min(smallest, arr[i + 1] - k);
            max=Math.max(largest,arr[i]+k);
            if(min<0) continue;
            ans=Math.min(ans,max-min);
        }
        return ans;
    }
}
