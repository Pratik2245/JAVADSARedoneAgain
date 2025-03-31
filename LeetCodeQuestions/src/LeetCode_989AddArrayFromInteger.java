//import java.util.ArrayList;
//import java.util.List;
//
//public class LeetCode_989AddArrayFromInteger {
//    public static void main(String[] args) {
//        int arr[]={1,2,0,0};
//        List<Integer> list=addToArrayForm(arr,34);
//        System.out.println(list);
//    }
//        public static List<Integer> addToArrayForm(int[] num, int k) {
//            List<Integer> list=new ArrayList<>();
////            int sum=0;
////            for (int i = 0; i <num.length; i++) {
////                sum=(sum*10)+num[i];
////            }
////            sum=sum+k;
////            while(sum>0){
////                int rem=sum%10;
////                list.add(rem);
////                sum=sum/10;
////            }
////            System.out.println(list.reversed());
////            another method
//            int i=num.length-1;
//            while (i>=0 || k>0){
//                if(i>=0){
//                    k=k+num[i];
//                    i--;
//                }
//                list.add(k%10);
//                k=k/10;
//            }
//            return list.reversed();
//        }
//}
