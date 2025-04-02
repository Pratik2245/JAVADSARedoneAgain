public class LeetCode_1108DefagingAnIpAddress {
    public static void main(String[] args) {
        String s= "1.1.1.1";
       String str= defangIPaddr(s);
        System.out.println(str);
        System.out.println("done successfully");
//        Output: "1[.]1[.]1[.]1"
    }
    public static String defangIPaddr(String address) {
        StringBuilder s=new StringBuilder();

        for (char ch:address.toCharArray()) {
            if(ch=='.'){
                s.append("[.]");

            }else {
                s.append(ch);
            }
        }
        return s.toString();
    }
}
