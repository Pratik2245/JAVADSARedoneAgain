public class LeetCode_376GuessTheNumberhigherOrLower {
    public static void main(String[] args) {
        
    }
}
//public class Solution extends GuessGame {
//    public int guessNumber(int n) {
//        int start=1;
//        int end=n;
//        int mid;
//        while(start<=end){
//            // mid=(start+end)/2;//instead of this we should use the other to save from stack overflow
//            mid=start+(end-start)/2;//better one
//            int result=guess(mid);
//            if(result==-1){
//                end=mid-1;
//            }else if(result==1){
//                start=mid+1;
//            }
//            else{
//                return mid;
//            }
//        }
//        return -1;
//    }
//}