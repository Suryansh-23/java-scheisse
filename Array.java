import java.io.PrintStream;
import java.util.Scanner;

public class Array {
    static Scanner sin = new Scanner(System.in);
    static PrintStream sout = System.out;

    public static void main(String[] args) {
        int[] a = inputArray();
        int[] b = inputArray();

        // areSame(a, b);
        // displayArray(union(a, b));
        // onlyOdd(a);
    }

    public static int[] inputArray() {
        sout.print("Enter the size of the array: ");

        int n = sin.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            sout.printf("Enter the %dth element: ", i + 1);
            arr[i] = sin.nextInt();
        }

        return arr;
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            sout.printf("%d, ", arr[i]);
        }

        sout.println();
    }

    public static boolean areSame(int[] a, int[] b) {
        if (a.length != b.length) {
            sout.print("no");
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                sout.print("no");
                return false;
            }
        }

        sout.print("yes");
        return true;
    }

    public static int[] union(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        return c;
    }

    public static boolean onlyOdd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sout.println("no");
                return false;
            }
        }

        sout.println("yes");
        return true;
    }
}
