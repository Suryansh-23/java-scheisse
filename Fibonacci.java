import java.io.PrintStream;
import java.util.Scanner;

class Fibonacci {
    public static void main(String args[]) {
        Scanner sin = new Scanner(System.in);
        PrintStream sout = System.out;
        int n = sin.nextInt();
        int a = 0, b = 1;

        if (n >= 1) {
            sout.print(a);
        }
        if (n >= 2) {
            sout.printf(", %d, ", b);
        }
        if (n > 2) {
            for (int i = 0; i < n - 2; i++) {
                b = a + b;
                a = b - a;
                sout.printf("%d, ", b);
            }
        }

        sout.println();
    }
}
