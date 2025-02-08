public class LeetCodeEvenDigitsProgram {
    public static void main(String[] args) {
        int arr[]={12,345,2,6,7896};
        searchEven(arr);
    }
    public static void searchEven(int arr[])
    {
    int count=0;
    for (int i = 0; i <arr.length ; i++) {
     while (arr[i]>0)
     {
         int digit = arr[i] % 10;
         arr[i] = arr[i] / 10;
         System.out.println(digit);
         count++;
//         System.out.println("hello");
     }
     if (count%2!=0){
         System.out.println("No of digits are odd");
         count=0;
     }else
     {
         System.out.println("No of digits are even");
         count=0;
     }
    }
//        System.out.println(count);

    }
}
