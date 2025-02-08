import java.util.Arrays;

public class MaximumProductInArray {
    public static void main(String[] args) {
        int arr[]={2,3,-2,4};
      int ans=  findMaxProduct(arr);
        System.out.println(ans);
    }
    public static int findMaxProduct(int arr[]){
        int n=arr.length;
        int leftProduct=1;
        int rightProduct=1;
        int ans=arr[0];
        for (int i = 0; i <arr.length ; i++) {
           leftProduct=leftProduct==0?1:leftProduct;
           rightProduct=rightProduct==0?1:rightProduct;

           leftProduct*=arr[i];
           rightProduct*=arr[n-1-i];
           ans=Math.max(ans,Math.max(leftProduct,rightProduct));
        }
        return ans;

    }
}
