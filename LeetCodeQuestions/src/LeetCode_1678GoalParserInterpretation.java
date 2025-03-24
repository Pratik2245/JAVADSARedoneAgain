import java.util.Stack;

public class LeetCode_1678GoalParserInterpretation {
    public static void main(String[] args) {
       String s= interpret("G()(al)");
        System.out.println(s);
    }
    public static String interpret(String command) {
//        char ch[]= command.toCharArray();
//        int i=0;
//        String s="";
//        int count=0;
//        while (i<ch.length){
//            if(ch[i]=='('){
//                i++;
//                count=0;
//            }
//            if(ch[i]==')'){
//                i++;
//                if(count==0){
//                    s+="o";
//                }
//            }
//            s=s+ch[i];
//            count++;
//            if(i<ch.length) {
//                i++;
//            }
//        }
        StringBuilder s=new StringBuilder();
        int i=0;
        while (i < command.length()) {

            if(command.charAt(i)=='G'){
             s.append("G");
             i++;
            }else if(i+1<command.length() && command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                   s.append("o");
                   i=i+2;
                }

            } else  {
                s.append("al");
                i=i+4;
            }
            i++;
        }
        return s.toString();
    }
}
