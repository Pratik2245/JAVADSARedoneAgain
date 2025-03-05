package StringMutability;

public class P {
    String name;
    int x;
    public static void main(String[] args) {
        P p1=new P();
        p1.name="CR";
        P p2=p1;
        p1.name="ACR";
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p2.x);
    }
}
