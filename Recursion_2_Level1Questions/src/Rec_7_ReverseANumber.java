public class Rec_7_ReverseANumber {
    public static void main(String[] args) {
        int number=1234;
       int ans= Reverse(number,0);
        System.out.println(ans);
    }
    public static int Reverse(int number,int rev){
        if(number==0){
            return rev;
        }
        return Reverse(number/10,rev*10+(number%10));
    }
}
