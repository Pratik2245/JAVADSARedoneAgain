public class tillingProblem {
    public static void main(String[] args) {
        int ans=TillingProblem(4);
        System.out.println(ans);
    }
    public static int TillingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int vertical=TillingProblem(n-1);
        int horizontal=TillingProblem(n-2);
        int total=vertical+horizontal;
        return total;
    }
}
