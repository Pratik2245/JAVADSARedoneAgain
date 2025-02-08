package String;

public class String_1SkipTheCharacter {
    public static void main(String[] args) {
        String s="baccab";
//        SkipTheString2("",s);
//        String s1=SkipTheString3("",s);
//        System.out.println(s1);
//        System.out.println(SkipTheString4(s));
        System.out.println(SkipApple("pratikapplepaithankar"));
    }
//    public static void SkipTheString(String s,int i){
//        if(i==s.length()){
//            return;
//        }
//        if(s.charAt(i)!='a') {
//            System.out.print(s.charAt(i));
//        }
//        SkipTheString(s,i+1);
//    }
    //or approach
    public static void SkipTheString2(String s1,String original){
        if(original.isEmpty()){
            System.out.println(s1);
            return;
        }
        char ch=original.charAt(0);
        if(ch=='a'){
            SkipTheString2(s1,original.substring(1));//move to the next index
        }else{
            SkipTheString2(s1+ch,original.substring(1));//move to the next index
        }
    }
//    same question for returnig a string
    public static String SkipTheString3(String s1,String original){
        if(original.isEmpty()){
            return s1;
        }
        char ch=original.charAt(0);
        if(ch=='a'){
             return SkipTheString3(s1,original.substring(1));//move to the next index
        }else{
            return SkipTheString3(s1+ch,original.substring(1));//move to the next index
        }
    }
    //or
    public static String SkipTheString4(String original){
        if(original.isEmpty()){
            return original;
        }
        char ch=original.charAt(0);
        if(ch=='a'){
            return SkipTheString4(original.substring(1));//move to the next index
        }else{
            return ch+SkipTheString4(original.substring(1));//move to the next index
        }
    }
//    skip a string starting with apple
public static String SkipApple(String original){
    if(original.isEmpty()){
        return original;
    }

    if(original.startsWith("apple")){
        return SkipApple(original.substring(5));//move to the next index
    }else{
        return original.charAt(0)+SkipApple(original.substring(1));//move to the next index
    }
}
}

