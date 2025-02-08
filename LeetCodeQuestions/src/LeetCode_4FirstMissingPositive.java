public class LeetCode_4FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1};
        int ans=FindMissingPositive(arr);
        System.out.println(ans);
    }
    public static  int FindMissingPositive(int arr[]){
        int i=0;
        int correct;
        while (i<arr.length) {
            correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i]<=arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }
}
