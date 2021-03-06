package javase01.t05;

/**
 * Prints two-diagonal square matrix with 1 on the diagonals.
 */

@SuppressWarnings("unused")
class Matrix {
    static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(((i == j) | (j == (n - 1 - i)) ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }
}
