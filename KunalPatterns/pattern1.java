//     *****
//     *****
//     *****
//     *****
//     *****
public class pattern1 {
  public static void main(String[] args) {
    int n = 5;
    // first method for i and j=1
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // second method for i and j =5
    // for (int i = n; i > 0; i--) {
    // for (int j = n; j > 0; j--) {

    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // third method for i=1 and j=5
    for (int i = 1; i <= n; i++) {
      for (int j = 5; j > 0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}