package StringRedoneQuestions;

public class SkipACharacter {
    public static void main(String[] args) {
        String s="bacapple";
        //for skipping character a recursion function
        String ans=skipString(s);
        System.out.println(ans);
    }
//    skipping a character
//    public static String skipCharacter(String s,String ans){
//        if(s.isEmpty()){
//            System.out.println(ans);
//            return ans;
//        }
//        char ch=s.charAt(0);
//        if(ch=='a'){
//            skipCharacter(s.substring(1),ans);
//        }else{
//            skipCharacter(s.substring(1),ans+ch);
//        }
//        return ans;
//    }

    //other way to do
//    public static String skipCharacter(String s){
//        if(s.isEmpty()){
//            return "";
//        }
//        char ch=s.charAt(0);
//        if(ch=='a'){
//           return skipCharacter(s.substring(1));
//        }
//        return ch+skipCharacter(s.substring(1));
//    }

//    skip a String example apple
    public static String skipString(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch=s.charAt(0);
        if(s.startsWith("apple")) {
            return skipString(s.substring(5));
        }
        return ch+skipString(s.substring(1));
    }

}
