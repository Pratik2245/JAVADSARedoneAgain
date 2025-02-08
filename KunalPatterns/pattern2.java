public class pattern2 {
  public static void main(String[] args) {
    // *
    // **
    // ***
    // ****
    // *****
    int n = 5;
    // ? for i and j=1
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // ? for i and j =n
    // for (int i = n; i > 0; i--) {
    // for (int j = n; j > 0; j--) {
    // if (i > n - j + 1)
    // continue;
    // else
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // ? for i =1 and j=5
    // for (int i = 1; i <= n; i++) {
    // for (int j = 5; j > 0; j--) {
    // if (i >= n - j + 1) {
    // System.out.print("*");
    // } else {
    // break;
    // }
    // }
    // System.out.println();

    // }

    // for i=5 and j=1
    for (int i = 5; i > 0; i--) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
