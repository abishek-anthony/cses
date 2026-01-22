import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;


public class Permutation {
    private static final String NO_SOLUTION = "NO SOLUTION";

    public Permutation() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        if (n == 1) {
            System.out.println(1);
        } else if (n > 3) {
            AtomicReference<HashSet<String>> firstHalf = new AtomicReference<>(new HashSet<>());
            AtomicReference<HashSet<String>> lastHalf = new AtomicReference<>(new HashSet<>());
            IntStream.range(1, n+1).forEach(i -> {
                if (i % 2 == 0) {
                    firstHalf.get().add(i + "");
                } else {
                    lastHalf.get().add(i + "");
                }
            });

            System.out.println(String.join(" ", firstHalf.get())+" "+String.join(" ", lastHalf.get()));
        } else {
            System.out.println(NO_SOLUTION);
        }
    }

}