public class Math_2_FindUniqueElementInArray {
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-1,-2,-3,4};
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans^=arr[i];
        }
        System.out.println("the unique element is ="+ans);
    }


}
