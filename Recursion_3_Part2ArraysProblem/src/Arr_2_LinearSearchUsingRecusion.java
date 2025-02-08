import java.util.ArrayList;
import java.util.Arrays;

public class Arr_2_LinearSearchUsingRecusion {
    public static void main(String[] args) {
        int arr[]={3,4,5,1,5,8,9};
        int target=5;
        
//        int index=Linear(arr,target,0);
//        System.out.println(index);
//        LinearMultiple(arr,target,0);
        ArrayList<Integer> i=new ArrayList<>();
//        LinearMultipleArrayList(arr,target,0,i);
//        System.out.println(i);
//       i= LinearMultipleArrayList(arr,target,0);
//        System.out.println(i);
    }
    public static int Linear(int arr[], int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }

        return Linear(arr,target,index+1);
    }
    //for multiple occurrence using linear search
    public static void LinearMultiple(int arr[],int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            System.out.println("element found at location="+index);
        }
        LinearMultiple(arr,target,index+1);
    }
//    to return an arraaylist using recursion
public static ArrayList<Integer> LinearMultipleArrayList(int arr[], int target, int index,ArrayList<Integer> arrList){
    if(index==arr.length){
        return arrList;
    }
    if(arr[index]==target){
       arrList.add(index);
    }
    return LinearMultipleArrayList(arr,target,index+1,arrList);
}

//returning list without passing argument in the function
   public static ArrayList<Integer> LinearMultipleArrayList(int arr[], int target, int index){
        ArrayList<Integer> list1=new ArrayList<>();
    if(index==arr.length){
        return list1;
    }
    if(arr[index]==target){
        list1.add(index);
    }
     ArrayList<Integer> list=LinearMultipleArrayList(arr,target,index+1);
    list1.addAll(list);
    return list1;
}
}
