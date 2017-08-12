package javase01.t04;

import com.sun.istack.internal.NotNull;

class Array {

    static double maxVal(double[] a) {
        double max = Double.MIN_VALUE;
        double[] sum = new double[a.length / 2];
        for (int i = 0; i < sum.length; i++ ) {
            sum[i] = a[i] + a[a.length - i - 1];
            System.out.println();
            if (sum[i] > max)
                max = sum[i];
        }
        return max;
    }
}
