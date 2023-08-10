import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;

public class StringQs {
    static Scanner sin = new Scanner(System.in);
    static PrintStream sout = System.out;

    public static void main(String[] args) {
        // hasVowel();
        // isPallindrome();
        distinctChars();
    }

    public static void hasVowel() {
        String s = sin.nextLine();

        // if (s.matches(".*[aeiou].*")) {
        // System.out.println("yes");
        // } else {
        // System.out.println("no");
        // }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' ||
                    s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u') {
                sout.println("yes");
                return;
            }
        }
    }

    public static void isPallindrome() {
        String s = sin.nextLine();

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                sout.println("no");
                return;
            }
        }

        sout.println("yes");
    }

    public static void distinctChars() {
        String s = sin.nextLine();
        HashSet<Character> hset = new HashSet<>();

        for (char c : s.toCharArray()) {
            hset.add(c);
        }

        sout.print("Distinct Characters: ");
        for (char c : hset) {
            sout.printf("%c ", c);
        }

        sout.printf("\nNo. of distinct characters: %d\n", hset.size());
    }
}
