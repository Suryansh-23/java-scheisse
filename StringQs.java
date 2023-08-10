import java.util.Scanner;

public class StringQs {
    static Scanner sin = new Scanner(System.in);

    public static void main(String[] args) {
        // hasVowel();
        isPallindrome();
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
                System.out.println("yes");
                return;
            }
        }
    }

    public static void isPallindrome() {
        String s = sin.nextLine();

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
    }
}
