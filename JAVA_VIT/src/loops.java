public class loops {
    static int num = 7; // Static variable to mimic the behavior of static in C

    // Function to mimic the behavior of f()
    static int f() {
        return num--;
    }
    public static void main(String[] args) {
        for (f(); f()>0; f()) {
            System.out.printf("%d",f());
        }

    }

}
