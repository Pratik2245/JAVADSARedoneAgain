import java.util.Scanner;

public class LeetCodeOriginalEven {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i = findNumbers(arr);
        System.out.println(i);
    }

    //leetcode solution
    public static int findNumbers(int[] nums) {
        int count = 0;
        int z = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0) {
                nums[i] = nums[i] / 10;
                count++;
            }
            if (count % 2 == 0) {
                z++;
                count = 0;
            } else {
                count = 0;
            }
        }
        return z;
    }
}



