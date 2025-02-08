import com.sun.security.jgss.GSSUtil;

public class leetCode_67_AddBinary {
    public static void main(String[] args) {
        String s1="11";
        String s2="1";
       String s= AddBinary(s1,s2);
        System.out.println(s);
    }
    public static  String AddBinary(String s1,String s2){
        StringBuilder s=new StringBuilder();
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carry=0;
        while (i>=0 || j>=0){
            int sum=carry;
            if(i>=0)sum+=s1.charAt(i)-'0';
            if(j>=0)sum+=s2.charAt(j)-'0';
            s.append(sum%2);
            carry=sum/2;
            j--;
            i--;
        }
        if(carry!=0) s.append(carry);
        return s.reverse().toString();
    }
}
