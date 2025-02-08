import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class LeetCode_338CountingBits {
    public static void main(String[] args) {
        int num=5;
        int[] f = new int[num + 1];
        for (int i=1; i<=num; i++)
        {
            f[i] = f[i >> 1] + (i & 1);
            System.out.println(f[i]);
        }
//        int sum=0;
//        int arr[]=new int[number+1];
//        for (int i = 0; i <=number; i++) {
//           String ans= Integer.toBinaryString(i);
//           sum=0;
//            for (char ch: ans.toCharArray()) {
//              if(ch=='1'){
//                  sum++;
//              }
//            }
//            arr[i]=sum;
//
//        }

        for (int i = 0; i <f.length ; i++) {
            System.out.println(f[i]);
        }
    }
}
