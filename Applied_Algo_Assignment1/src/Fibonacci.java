public class Fibonacci {

    /**
     * @param n
     * @return fibonacci of given number
     */
    static int fibonacci(int n) {

        if (n >= 2) {
            int fibOne = 1;
            int fibZero = 0;
            int fibN = 0;

            for (int i = 1; i < n; i++) {
                fibN = fibZero + fibOne;
                fibZero = fibOne;
                fibOne = fibN;
            }

            return fibN;
        } else {
            return n;                // Return 0 or 1 for fibonacci of 0 or 1 respectively.
        }

    }


}
