import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

import static java.math.BigInteger.*;

public class WeirdAlgorithm {
    static BigInteger THREE = valueOf(3);

    // https://cses.fi/problemset/task/1068/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger n = input.nextBigInteger();
        if (!n.equals(ONE)) {
            run(n);
        }
        System.out.print(1);
    }

    private static void run(BigInteger n) {
        System.out.print(n + " ");
        if (n.mod(TWO).equals(ZERO)) {
            BigInteger m = n.divide(TWO);
            if (!Objects.equals(m, ONE)) {
                run(m);
            }
        } else {
            run(n.multiply(THREE).add(ONE));
        }
    }
}