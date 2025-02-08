public class Math_3_FindTheIthBit {
    public static void main(String[] args) {
        int num=2;
        int bit=1;
//        logic for setting the ith bit in the program by doing or operation
//        int ans=1<<bit;
//        System.out.println(num|ans);
        //resetting the ith bit in the program
//        int ans1=~(1<<bit);
//        System.out.println(num&ans1);


//        find the right most bit set at the right side
        int number=1;
        rightBit(number);
    }
    public static  int rightBit(int number){
        int ans=number & (-number);
        System.out.println(ans);
        return ans;
    }

}
