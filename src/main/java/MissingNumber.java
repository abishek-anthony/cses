import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;


import static java.math.BigInteger.*;

public class MissingNumber {

    //https://cses.fi/problemset/task/1083
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger n = new BigInteger(input.nextLine()).add(ONE);
        Set<String> listMissingOneNumber = toSetOfStrings(input);

        String result = "";
        for (BigInteger i = ONE; !i.equals(n); i = i.add(ONE)) {
            if (listMissingOneNumber.contains(i.toString())) {
                continue;
            } else {
                result = i.toString();
                break;
            }
        }
        System.out.println(result);
    }

    private static Set<String> toSetOfStrings(Scanner input) {
        return Arrays.stream(input.nextLine().split(" ")).collect(Collectors.toSet());
    }

}