import java.util.ArrayList;
import java.util.List;

public class LeetCode_989AddArrayFromInteger {
    public static void main(String[] args) {
        int arr[]={1,2,0,0};
        addToArrayForm(arr,34);;
    }
        public static List<Integer> addToArrayForm(int[] num, int k) {
            List<Integer> list=new ArrayList<>();
            int sum=0;
            for (int i = 0; i <num.length; i++) {
                sum=(i*10)+num[i];
            }
            System.out.println(sum);
            return list;
        }
}
