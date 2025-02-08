public class Bit_3FindTheithBit {
    public static void main(String[] args) {
        int number =6;
        int bit=3;
        int ans=number& (1<<bit);
        System.out.println(ans);//this will give me the number that is updated after shifting the bit
        if(ans!=0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
