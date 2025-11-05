class Solution {
    public double myPow(double x, int n) {
        
      double ans = 1.0;
        long m; // Use long to safely handle Integer.MIN_VALUE

        if (n < 0) {
            x = 1 / x;
            m = -(long)n; // Cast n to long before negation
        } else {
            m = n; // Implicitly promoted to long
        }

        while (m > 0) {
            if (m % 2 == 1) {
                ans *= x;
                m -= 1;
            } else {
                x *= x;
                m /= 2;
            }
        }

        return ans;


    }
}