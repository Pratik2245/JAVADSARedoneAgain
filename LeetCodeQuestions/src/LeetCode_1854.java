public class LeetCode_1854 {
    public static void main(String[] args) {

    }
    public static int maximumPopulation(int[][] logs) {
    int[] popChange = new int[101]; // Covers years 1950 to 2050

    // Mark birth and death changes
        for (int[] log : logs) {
        popChange[log[0] - 1950]++;  // Increment birth year
        popChange[log[1] - 1950]--;  // Decrement death year
    }

    // Find year with max population
    int maxPop = 0, currPop = 0, earliestYear = 1950;
        for (int year = 0; year < 101; year++) {
        currPop += popChange[year]; // Update population count

        if (currPop > maxPop) {
            maxPop = currPop;
            earliestYear = 1950 + year;
        }
    }
        return earliestYear;
}
}
