import java.util.Arrays;

public class LeetCode_832FippingAImage {
    public static void main(String[] args) {
        int arr[][]={{1,1,0},{1,0,1},{0,0,0}};
        int arr2[][]=flipAndInvertImage(arr);
        for (int i = 0; i <arr2.length; i++) {
            for (int j = 0; j <arr2[0].length ; j++) {
                System.out.println(arr2[i][j]);
            }
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        for (int[] row:image) {
           int left=0,right=n-1;
           while (left<=right){
               int temp=row[left]^1;
               row[left]=row[right]^1;
               row[right]=temp;
               left++;
               right--;
           }
        }
        for (int i = 0; i <image.length ; i++) {
            for (int j = 0; j < image[0].length ; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println();
        }
        return image;
    }
}
