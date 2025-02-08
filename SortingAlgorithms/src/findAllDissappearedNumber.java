import java.util.ArrayList;
import java.util.List;

public class findAllDissappearedNumber {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,2,3,1};

        List<Integer> l=new ArrayList<>();
        l=cyclicSort(arr);
        System.out.println(l);
    }
    static List<Integer> cyclicSort(int arr[]) {
        List<Integer> l=new ArrayList<>();
        int index;
        int i = 0;
        while (i < arr.length) {
            index = arr[i]-1;//index
            if (arr[i] != arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            } else {
                i++;
            }
        }
        //print the array
        System.out.println("array is=");
        for (int j = 0; j <arr.length ; j++) {
        System.out.println("elements are="+arr[j]);
        }
        for (int j = 0; j <arr.length; j++) {
            if (arr[j] != j+1) {
                l.add(j+1);
            }
        }
       return  l;
    }
}
