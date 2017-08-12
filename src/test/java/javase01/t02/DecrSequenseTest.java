package javase01.t02;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecrSequenseTest {

    @Test
    public void solve(){
        double eps = 0.2;
        long result = DecrSequense.solve(eps);
        double a = 1 / Math.pow(result + 1, 2);
        double prevA = 1 / Math.pow(result, 2);
        assertTrue((a < eps) && (prevA >= eps));
    }

}