class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        double result = 1.0;
        long power = Math.abs((long) n); // Use long to handle Integer.MIN_VALUE

        while (power > 0) {
            if (power % 2 == 1) {
                result *= x;
            }
            x *= x;
            power /= 2;
        }

        return (n < 0) ? 1 / result : result;
    }
}
