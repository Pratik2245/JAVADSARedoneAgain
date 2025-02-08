public class Bit_2CheckUniqueInArray {
    public static void main(String[] args) {
        int arr[]={-2,3,-2,-4,-5,-5,-4};
        int unique=0;
        for(int num:arr){
            unique^=num;
        }
        System.out.println(unique);
    }
}
