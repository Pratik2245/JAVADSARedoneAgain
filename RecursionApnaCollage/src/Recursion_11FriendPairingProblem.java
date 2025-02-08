public class Recursion_11FriendPairingProblem {
    public static void main(String[] args) {
       int total= Pair(4);
        System.out.println(total);
    }

    private static int Pair(int n) {
    if(n==1 || n==2){
        return n;
    }
    int single=Pair(n-1);
    int pair=(n-1)*Pair(n-2);
    int total=single+pair;
    return total;
    }
}
