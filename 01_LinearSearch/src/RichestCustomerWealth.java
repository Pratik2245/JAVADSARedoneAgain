public class RichestCustomerWealth {
    public static void main(String[] args) {
        int accounts[][] = {{1, 5}, {7, 3}, {10, 5}};

        maximumWealth(accounts);
    }

    public static void maximumWealth(int[][] accounts) {
        int maxVal = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];

            }
            if (sum > maxVal) {
                maxVal = sum;
            }
        }
        System.out.println(maxVal);
    }
}
