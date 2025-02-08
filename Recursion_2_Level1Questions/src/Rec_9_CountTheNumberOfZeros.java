public class Rec_9_CountTheNumberOfZeros {
    public static void main(String[] args) {
        int number=100230;
        int ans=countZeros(number,0);
        System.out.println(ans);
    }
    public static int countZeros(int number,int count){
        if(number==0){
            return  count;
        }
        if(number%10==0){
            return countZeros(number/10,count+1);
        }
        return countZeros(number/10,count);
    }
}
