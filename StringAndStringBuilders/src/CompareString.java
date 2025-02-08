import java.util.ArrayList;
import java.util.List;

public class CompareString {
    public static void main(String[] args) {
        //for string pool
//        String a="pratik";
//        String b="pratik";
//        System.out.println(a==b);

        //outside the string pool
        String a=new String("pratik");
        String b=new String("pratik");
        System.out.println(a.equals(b));//true
//        beacuse it is not  inside the string pool and not pinting t the same object
        System.out.println(a==b);//false


        //array list
        List<Integer> l=new ArrayList<>();
        l.add(23);
        l.add(24);
        System.out.println("Pratik"+l);


        //strip function used for trimming
        String name="    pratik    ";
        System.out.println(name.strip());
    }
}
