import java.util.ArrayList;
import java.util.List;

public class FindAllDissappreadedNumberCyclicSort {
    public static void main(String[] args) {
       int[] nums = {4,3,2,7,8,2,3,1,1,10};
       List<Integer> l=new ArrayList<>();
       l=findDisappearedNumbers(nums);
       System.out.println(l);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
       int i=0;
       while (i<nums.length){
       int correct=nums[i]-1;
        if(nums[i] != nums[correct]){
            int temp=nums[i];
            nums[i]=nums[correct];
            nums[correct]=temp;
        }else {
            i++;
        }
       }
        for (int k = 0; k <nums.length ; k++) {
            System.out.println(nums[k]);
        }
       List<Integer> l=new ArrayList<>();
        for (int j = 0; j <nums.length ; j++) {
            if(nums[j]!=j+1){
                l.add(j+1);
            }
        }
        return l;
    }
}
