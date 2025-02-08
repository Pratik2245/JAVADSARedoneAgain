import java.util.Arrays;

public class serachingIn2DArray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{5,3},{8,9,6}};
        int serchElement=99;
        serchData(arr,serchElement);
    }
    public static void serchData(int[][] arr,int searchElement){
        for (int i = 0; i <arr.length ; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//            System.out.println(i);
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]);
                if (arr[i][j]==searchElement){
                    System.out.println("element found at location "+i+","+j);
                }
            }

        }

    }
}
