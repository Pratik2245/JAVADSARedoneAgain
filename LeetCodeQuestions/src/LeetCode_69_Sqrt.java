public class LeetCode_69_Sqrt {
    public static void main(String[] args) {
        int number = 8;
        int ans = Sqrt(number);
        System.out.println(ans);
    }
//    public static int TakeSquareRoot(int number){
//        int start=0;
//        int end=number;
//        int mid;
//        int ans=0;
//     while (start<=end) {
//         mid = start+(end-start) / 2;
//         if ((long)mid * mid == number) {
//             return mid;
//         }
//         if ((long)mid * mid < number) {
//             ans = mid;
//             start = mid + 1;
//         } else  {
//             end = mid - 1;
//         }
//     }
//     return ans;
//
//    }


    public static int Sqrt(int num) {
        int start = 0, end = num, mid, ans = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((long) mid * mid == num)
                return mid;
            if ((long) mid * mid < num) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}