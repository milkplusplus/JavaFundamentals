package javase01.t02;

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
