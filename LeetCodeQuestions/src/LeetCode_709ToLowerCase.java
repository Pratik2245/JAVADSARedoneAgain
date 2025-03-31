import java.sql.SQLOutput;

public class LeetCode_709ToLowerCase {
    public static void main(String[] args) {
     String s=toLowerCaseManual("PRATIK");
        System.out.println(s);
    }
    public static String toLowerCaseManual(String str) {
        StringBuilder stringBuilder=new StringBuilder();
        for(char c:str.toCharArray()){
            if(c >= 'A' && c <= 'Z'){
                stringBuilder.append((char) (c+32));
            }else{
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
