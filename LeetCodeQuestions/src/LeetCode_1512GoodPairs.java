public class LeetCode_1512GoodPairs {
    public static void main(String[] args) {
//        int arr[]={1,2,3,1,1,3};
        int arr[]={1,1,1,1};
        int ans=goodPairs(arr);
        System.out.println(ans);
    }
    public static int goodPairs(int arr[]){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j =i+1; j <arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        return  count;
    }
}
