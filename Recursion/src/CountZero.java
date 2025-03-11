public class CountZero {
    public static void main(String[] args) {
        System.out.println(count(30210)); // Expected output: 2
    }

    static int count(int n) {
        return helper(n, 0);  // Calls the helper function with an initial count of 0
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;  // Base case: if n becomes 0, return the count
        }

        int rem = n % 10;  // Extract the last digit
        if (rem == 0) {
            return helper(n / 10, c + 1);  // If last digit is 0, increment count
        }
        return helper(n / 10, c);  // Otherwise, continue without incrementing count
    }
}
