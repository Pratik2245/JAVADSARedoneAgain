import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={18,12,9,14,77,50};
        int serachElement=sc.nextInt();
        int result=LinearSearch(arr,serachElement);
        if (result==-1){
            System.out.println("element not found");
        }else{
            System.out.println("Element found at location "+result);
        }
    }
    static int LinearSearch(int[] arr,int serachElement){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length ; i++) {
            if(serachElement==arr[i])
            {
                return i;
            }
        }
        return -1;

    }
}
