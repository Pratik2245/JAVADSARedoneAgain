public class Recursion_7PrintXPower {
    public static void main(String[] args) {
        int ans=PrintPower(2,5);
        System.out.println(ans);
    }
    public static int PrintPower(int num,int power){
        if(power==0){
            return 1;
        }
        return num*PrintPower(num,power-1);
    }
}
