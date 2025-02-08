public class complimentOfANumber {
    public static void main(String[] args) {
        int num=5;
        String binary=Integer.toBinaryString(num);
        System.out.println(binary);
        char ch[]=binary.toCharArray();
        StringBuilder s=new StringBuilder();
        for (char character:ch){
            s.append(character=='0'?'1':'0');
        }
        System.out.println(binary);
        System.out.println(s.toString());
    }
}
