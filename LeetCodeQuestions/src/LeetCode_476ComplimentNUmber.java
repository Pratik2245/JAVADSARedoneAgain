public class LeetCode_476ComplimentNUmber
{
    public static void main(String[] args) {
        int num=5;
//        String binary=Integer.toBinaryString(num);
//        char ch[]=binary.toCharArray();
//        StringBuilder s=new StringBuilder();
//        for (char character:ch){
//            s.append(character=='0'?'1':'0');
//        }
//        int ans=Integer.parseInt(s.toString(), 2);
//        System.out.println(ans);
        int mask = (Integer.highestOneBit(num) << 1) - 1; // Create a mask
        System.out.println(num ^ mask); // Flip the bits using XOR


//        explanation
//        Integer.highestOneBit(num):
//        Finds the most significant bit (leftmost 1 in num).
//                Example: num = 5 (101), highestOneBit(5) = 100.
//        (Integer.highestOneBit(num) << 1) - 1:
//        Creates a bitmask with all 1s up to the highest bit.
//        Example: 100 << 1 = 1000, 1000 - 1 = 111.
//        num ^ mask:
//        XOR operation flips only the bits up to the highest bit.
//                Example: 101 ^ 111 = 010, which is 2.
    }

}
