public class LeetCode_1486XOROperationInArray {
    public static void main(String[] args) {
       int ans= xorOperation(5,0);
        System.out.println(ans);
    }
    public static int xorOperation(int n, int start) {
        int sum=start;
        int temp=start;
        for (int i = 0; i <n-1 ; i++) {
            temp+=2;
            sum=sum^temp;
        }
        return sum;
    }
}
