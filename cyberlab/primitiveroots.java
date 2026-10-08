import java.util.Scanner;

public class PrimitiveRoot {

    // Check whether a number is prime
    static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // Calculate a^b mod m
    static int modPower(int a, int b, int m) {

        int result = 1;

        for (int i = 1; i <= b; i++) {
            result = (result * a) % m;
        }

        return result;
    }

    // Check whether g is a primitive root modulo p
    static boolean isPrimitiveRoot(int g, int p) {

        boolean[] found = new boolean[p];

        // Calculate g^1, g^2, ..., g^(p-1)
        for (int i = 1; i <= p - 1; i++) {

            int value = modPower(g, i, p);

            // If the same value appears again,
            // g is not a primitive root
            if (found[value]) {
                return false;
            }

            found[value] = true;
        }

        // Check whether all values 1 to p-1 occurred
        for (int i = 1; i < p; i++) {

            if (!found[i]) {
                return false;
            }
        }

        return true;
    }

    // Find all primitive roots
    static void findPrimitiveRoots(int p) {

        if (!isPrime(p)) {

            System.out.println("\n" + p + " is not prime.");
            System.out.println(
                "This program finds primitive roots for prime numbers."
            );

            return;
        }

        System.out.println("\n---------- PRIMITIVE ROOT CALCULATION ----------");

        System.out.println("p = " + p);
        System.out.println("Since p is prime:");
        System.out.println("φ(p) = p - 1");
        System.out.println("φ(" + p + ") = " + (p - 1));

        System.out.println("\nPrimitive root condition:");
        System.out.println(
            "g is a primitive root if g^1, g^2, ..., g^(p-1)"
        );
        System.out.println(
            "generate all numbers from 1 to " + (p - 1) + " modulo " + p
        );

        System.out.println("\n---------- CHECKING VALUES ----------");

        System.out.print("Primitive roots: ");

        boolean foundRoot = false;

        for (int g = 2; g < p; g++) {

            if (isPrimitiveRoot(g, p)) {

                foundRoot = true;
                System.out.print(g + " ");
            }
        }

        if (!foundRoot) {
            System.out.println("None");
            return;
        }

        System.out.println();

        // Show detailed calculation for every primitive root
        System.out.println(
            "\n---------- CALCULATION STEPS ----------"
        );

        for (int g = 2; g < p; g++) {

            if (isPrimitiveRoot(g, p)) {

                System.out.println(
                    "\ng = " + g + " is a primitive root modulo " + p
                );

                System.out.println("Powers:");

                for (int i = 1; i <= p - 1; i++) {

                    int value = modPower(g, i, p);

                    System.out.println(
                        g + "^" + i + " mod " + p + " = " + value
                    );
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter prime number p: ");
        int p = sc.nextInt();

        findPrimitiveRoots(p);

        sc.close();
    }
}
