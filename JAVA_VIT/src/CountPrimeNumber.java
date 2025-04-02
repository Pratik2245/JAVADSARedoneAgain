public class CountPrimeNumber {
    public static void main(String[] args) {
        int count=0;
        for (int i = 2; i <=10 ; i++) {
            boolean b= countPrimeNUmber(i);
            if(b){
                count+=1;
            }
        }
        System.out.println(count);
    }
    public static boolean countPrimeNUmber(int number){
        if(number<2){
            return false;
        }
        for (int i = 2; i <number; i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;

    }
}
