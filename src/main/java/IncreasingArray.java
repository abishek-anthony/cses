import java.math.BigInteger;
import java.util.*;
        import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class IncreasingArray {

    //https://cses.fi/problemset/task/1094
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();

        AtomicReference<BigInteger> moves = new AtomicReference<>(BigInteger.ZERO);
        final AtomicReference<BigInteger> previousNumber = new AtomicReference<>();

        Arrays.stream(input.nextLine().split(" "))
                .map(it -> {
                    BigInteger integer = new BigInteger(it);
                    if (previousNumber.get() == null) {
                        previousNumber.set(integer);
                    } else {
                        BigInteger prev = previousNumber.get();
                        if (prev.compareTo(integer) > 0) {
                            moves.set(moves.get().add(prev.subtract(integer)));
                            previousNumber.set(prev);
                        } else {
                            previousNumber.set(integer);
                        }
                    }
                    return null;
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        System.out.println(moves.get());
    }
}