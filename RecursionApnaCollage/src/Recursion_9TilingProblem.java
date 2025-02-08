public class Recursion_9TilingProblem {
    public static void main(String[] args) {
        int ans=tilingProblem(3);
        System.out.println(ans);
    }

    private static int tilingProblem(int i) {
//        base case
        if(i==0  || i==1){
            return 1;
        }
    int tfv=tilingProblem(i-1);
    int tfh=tilingProblem(i-2);
    return tfv+tfh;
    }
}
