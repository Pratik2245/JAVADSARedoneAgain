public class Recursion_8PrintXPowerOptimised {
    public static void main(String[] args) {
        int ans=PrintPower(2,5);
        System.out.print(ans);
    }
//    more optimized code for the same approach
    public static int PrintPower(int num,int power){
        if(power==0){
            return 1;
        }
        int a=PrintPower(num,power/2);
        int halfPower= a*a;
        if(power%2!=0){
            halfPower=num*halfPower;
        }
        return halfPower;
    }
}
