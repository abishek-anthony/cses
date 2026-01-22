import java.util.Scanner;

public class Repetitions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int maxCount = 0;
        int currentCount = 0;
        char currentLetter = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == currentLetter) {
                currentCount++;
                if (currentCount >= maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentLetter = c;
                currentCount = 1;
            }
        }
        System.out.println(maxCount);
    }
}