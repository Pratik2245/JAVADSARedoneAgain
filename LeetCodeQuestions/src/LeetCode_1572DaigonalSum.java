public class LeetCode_1572DaigonalSum {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        int sum=daigonalSum(arr);
        System.out.println(sum);
    }
    public static int daigonalSum(int arr[][]){
        int n=arr.length;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
        }
        for (int i = 0; i <n ; i++) {
            sum+=arr[i][n-1-i];
        }
        if(n%2!=0){
            sum-=arr[n/2][n/2];
        }
        return sum;
    }
}
