package javase01.t03;

@SuppressWarnings("unused")
class Tangens {
    static void solve(double a, double b, double h) {
        System.out.println(" x                F(x)");
        for (double i = a; i <= b; i += h)
            System.out.println(i + "       " + (Math.tan(2 * i) - 3));
    }
}
