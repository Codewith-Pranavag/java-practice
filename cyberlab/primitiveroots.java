import java.util.Scanner;

public class EulerTotient {

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

    // Calculate GCD
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Calculate p^k
    static int power(int p, int k) {
        int result = 1;

        for (int i = 0; i < k; i++) {
            result *= p;
        }

        return result;
    }

    // Euler Totient Function
    static int phi(int n) {

        if (n == 1)
            return 1;

        if (isPrime(n))
            return n - 1;

        // Rule 3: n = p^k
        for (int p = 2; p * p <= n; p++) {

            if (isPrime(p) && n % p == 0) {

                int temp = n;
                int k = 0;

                while (temp % p == 0) {
                    temp /= p;
                    k++;
                }

                if (temp == 1) {
                    return power(p, k) - power(p, k - 1);
                }
            }
        }

        // Rule 4: n = p*q
        for (int p = 2; p < n; p++) {

            if (isPrime(p) && n % p == 0) {

                int q = n / p;

                if (isPrime(q) && p != q) {
                    return (p - 1) * (q - 1);
                }
            }
        }

        // General case
        int result = n;

        for (int p = 2; p <= n; p++) {

            if (isPrime(p) && n % p == 0) {
                result = result - result / p;
            }
        }

        return result;
    }

    // Display the table
    static void displayTable(int n) {

        System.out.println("\n---------- GCD TABLE ----------");

        // Horizontal row: numbers
        System.out.print("Numbers : ");

        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println();

        // Vertical row: gcd values
        System.out.print("gcd(" + n + ",i):");

        int count = 0;

        for (int i = 1; i <= n; i++) {

            int g = gcd(n, i);

            System.out.printf("%4d", g);

            if (g == 1)
                count++;
        }

        System.out.println();

        // Display relatively prime numbers
        System.out.print("\nNumbers relatively prime to " + n + ": ");

        for (int i = 1; i <= n; i++) {
            if (gcd(n, i) == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("Count = " + count);
        System.out.println("Therefore φ(" + n + ") = " + count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        // Display GCD table
        displayTable(n);

        // Show formula-based calculation
        System.out.println("\n---------- CALCULATION STEPS ----------");

        if (n == 1) {

            System.out.println("Rule 1:");
            System.out.println("φ(1) = 1");

        } else if (isPrime(n)) {

            System.out.println("Rule 2: n is prime");
            System.out.println("φ(n) = n - 1");
            System.out.println("φ(" + n + ") = " + n + " - 1 = " + phi(n));

        } else {

            boolean primePower = false;

            for (int p = 2; p * p <= n; p++) {

                if (isPrime(p) && n % p == 0) {

                    int temp = n;
                    int k = 0;

                    while (temp % p == 0) {
                        temp /= p;
                        k++;
                    }

                    if (temp == 1) {

                        primePower = true;

                        System.out.println("Rule 3: n = p^k");

                        System.out.println(n + " = " + p + "^" + k);

                        System.out.println(
                            "φ(p^k) = p^k - p^(k-1)"
                        );

                        System.out.println(
                            "φ(" + n + ") = " +
                            power(p, k) + " - " +
                            power(p, k - 1)
                        );

                        System.out.println(
                            "φ(" + n + ") = " + phi(n)
                        );

                        break;
                    }
                }
            }

            if (!primePower) {

                boolean productOfTwoPrimes = false;

                for (int p = 2; p < n; p++) {

                    if (isPrime(p) && n % p == 0) {

                        int q = n / p;

                        if (isPrime(q) && p != q) {

                            productOfTwoPrimes = true;

                            System.out.println(
                                "Rule 4: n = p × q, where p and q are prime"
                            );

                            System.out.println(
                                n + " = " + p + " × " + q
                            );

                            System.out.println(
                                "φ(n) = φ(p) × φ(q)"
                            );

                            System.out.println(
                                "φ(" + n + ") = (" +
                                p + " - 1) × (" +
                                q + " - 1)"
                            );

                            System.out.println(
                                "φ(" + n + ") = " + phi(n)
                            );

                            break;
                        }
                    }
                }

                if (!productOfTwoPrimes) {

                    System.out.println(
                        "General Euler Totient calculation"
                    );

                    System.out.println(
                        "φ(" + n + ") = " + phi(n)
                    );
                }
            }
        }

        sc.close();
    }
}
