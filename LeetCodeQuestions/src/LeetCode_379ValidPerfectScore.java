public class LeetCode_379ValidPerfectScore {
    public static void main(String[] args) {
        int num=16;
        boolean ans=ValidPerfectSquare(num);
        System.out.println(ans);
    }
    public static  boolean ValidPerfectSquare(int num){
//        if (num < 1) return false;
//        int start=1;
//        int end=num;
//        while (start<=end){
//            int mid=start+(end-start)/2;
//            if((mid*mid)==num){
//                return true;
//            }else if(mid*mid>num){
//                end=mid-1;
//            } else if (mid*mid<num) {
//                start=mid+1;
//            }
//        }
//        return false;
//        it is optimised solution but i have more optimised than this
        if(num<0)return false;
        if(num<2)return true;
        long x=num;
        while (x*x>num){

            x=(x+num/x)/2;
            System.out.println(x);
        }
        return x*x==num;
    }

}
