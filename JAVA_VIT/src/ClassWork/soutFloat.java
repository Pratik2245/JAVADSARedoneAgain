package ClassWork;

public class soutFloat {
    public static void main(String[] args) {
        float c=15.3886213214f;
        int a=5;
        System.out.printf("%f%n",c);//is using the %f format specifier to print the floating-point
        // value of c. By default, %f in printf prints the floating-point number with 6 digits after the decimal point.
        System.out.printf("%.2f%n",c);//it will print only 2 decimal after point
        System.out.printf("%13d%n",a);
        System.out.printf("%13f%n",c);
        System.out.printf("%013f%n",c);
        System.out.printf("%-13f;%n",c);
        System.out.printf("%13.2f%n",c);
    }
}
