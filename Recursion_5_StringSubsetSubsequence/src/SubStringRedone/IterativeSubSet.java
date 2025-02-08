package SubStringRedone;

import java.util.ArrayList;
import java.util.List;
//1️⃣ Subsets
//A subset is a collection of elements selected in any order,
//without considering their positions in the original set.

//2️⃣ Subsequences
//A subsequence is formed by removing some
//elements from the sequence without changing the order of the remaining elements.

public class IterativeSubSet {
    public static void main(String[] args) {
        String s="abc";
//        subSet(s,"");
        int arr[]={1,2,3};
        numberSubSet(arr);
    }
//    the flow of the below program
//    First Iteration (ch = 'a'):
//    size = list.size() = 1 (Initially, only "" is in the list).
//    The loop iterates once (size = 1):
//    list.add(list.get(0) + 'a') → list.add("" + 'a') → list.add("a")
//    ✅ Updated list: ["", "a"]
//    Second Iteration (ch = 'b'):
//    size = list.size() = 2 (["", "a"] from the previous iteration).
//
//    The loop iterates twice (size = 2):
//
//    list.add(list.get(0) + 'b') → list.add("" + 'b') → list.add("b")
//    list.add(list.get(1) + 'b') → list.add("a" + 'b') → list.add("ab")
//    ✅ Updated list: ["", "a", "b", "ab"]
//
//    Third Iteration (ch = 'c'):
//    size = list.size() = 4 (["", "a", "b", "ab"]).
//
//    The loop iterates four times (size = 4):
//
//    list.add(list.get(0) + 'c') → list.add("" + 'c') → list.add("c")
//    list.add(list.get(1) + 'c') → list.add("a" + 'c') → list.add("ac")
//    list.add(list.get(2) + 'c') → list.add("b" + 'c') → list.add("bc")
//    list.add(list.get(3) + 'c') → list.add("ab" + 'c') → list.add("abc")
//    ✅ Final list: ["", "a", "b", "ab", "c", "ac", "bc", "abc"]
    public static void subSet(String s,String ans){
        int i=0;
        List<String> list=new ArrayList<>();
        list.add("");
        for (char ch:s.toCharArray()) {
            int size=list.size();
            System.out.println("size of list="+size);
            for (int j = 0; j <size ; j++) {
                list.add(list.get(j) + ch);
            }
        }
        for (String subset:list) {
            System.out.print(subset+" ");
        }
    }

    //for number subset
    public static void numberSubSet(int[] arr){
        List<List<Integer>> list =new ArrayList<>();
        list.add(new ArrayList<>()); //here it will have an empty list first so that
        //the list size can be maintained
        for (int num:arr){
            int size=list.size();
            for (int i = 0; i <size ; i++) {
                List<Integer> tempList=new ArrayList<>(list.get(i));//get the previous element so that it can be
                //used to store the subsets
                tempList.add(num);
                list.add(tempList);
            }
        }
        for (List<Integer> subset:list) {
            System.out.println(subset);
        }
    }

}
