public class BitwiseUniqueElementInArray {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,2,1,3,6,8,6,4};
//        int arr[]={-2,-3,-4,-1,-2,-1,-3,6,-4};
        System.out.println(ans(arr));
    }
//    so the ans for the above problem is xor all the numbers with the duplicates and then you will get the unique element
    public static int ans(int arr[]){
        int unique=0;
        for (int i =0;i<arr.length;i++) {
           unique^=arr[i];
           //this will xor all the elements with duplicates and then return the unique element
        }
        return unique;
    }
}
