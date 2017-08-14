package javase01.t02;

/**Finds the least number (n) of the sequence of elements which satisfies this M condition: <br>
 * M : a_n < eps, a_n = 1 / (n + 1)^2, <br>
 * and prints this number and all elements a_i, where i = 1, 2, ..., n.
 */

class DecrSequense {

     static long solve(double eps) {
        long i = 0;
        double a;
        do {
            i++;
            a = 1 / Math.pow(i + 1, 2);
            System.out.println("a[" + i + "] = " + a);
        }
        while (a >= eps);
        System.out.println("The number you are looking for is " + i);
        return i;
    }
}
