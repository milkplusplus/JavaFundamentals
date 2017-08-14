package javase01.t04;

/**
 * Determines max value of (a_1 + a_2n, a_2 + a_2n-1, ..., a_n + a_n+1) for (a_1, a_2, ..., a_2n) input array.
 */

class Array {

    static double maxVal(double[] a) {
        double max = Double.MIN_VALUE;
        double[] sum = new double[a.length / 2];
        for (int i = 0; i < sum.length; i++ ) {
            sum[i] = a[i] + a[a.length - i - 1];
            System.out.println("sum[" + i + "] = " + sum[i]);
            if (sum[i] > max)
                max = sum[i];
        }
        System.out.println("max value is " + max);
        return max;
    }
}
