package dsaQuestionsByAmazonGoogleFacebook;

public class celingOfCharacter {
    public static void main(String[] args) {
        char[] letters={'o','w','x','y'};
        char target='z';
       char s= ceilingCharacter(letters,target);
        System.out.println(s);
    }
    public static char ceilingCharacter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        while (start<=end){
            int mid = (start + end) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else if (letters[mid] > target) {
                end=mid-1;
            }

            System.out.println(start);
        }
        System.out.println("start"+start);
        System.out.println("length"+letters.length);
        return  letters[start % letters.length];
    }
}
