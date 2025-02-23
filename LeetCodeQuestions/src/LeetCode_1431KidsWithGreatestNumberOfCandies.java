import java.util.ArrayList;
import java.util.List;

public class LeetCode_1431KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int arr[]={4,2,1,1,2};
       List<Boolean>b= kidsWithCandies(arr,1);
        System.out.println(b);

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> list=new ArrayList<>();
       int lastElement=candies[0];
        for(int i = 1; i <candies.length; i++) {
           lastElement=Math.max(candies[i],lastElement);
        }
        for (int candy : candies) {
            list.add((candy+extraCandies)>=lastElement);
        }
        return list;
    }
}
