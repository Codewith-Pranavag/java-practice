import java.util.Scanner;

public class PrimitiveRoot {

    static Scanner sc = new Scanner(System.in);

    // Check whether a number is prime
    static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // Calculate a^b mod m using fast exponentiation
    static long modPower(long a, long b, int m) {

        long result = 1;
        a %= m;

        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % m;
            }

            a = (a * a) % m;
            b /= 2;
        }

        return result;
    }

    // Check whether g is a primitive root modulo p
    static boolean isPrimitiveRoot(int g, int p) {

        if (g < 1 || g >= p)
            return false;

        long value = 1;

        for (int i = 1; i < p; i++) {

            value = (value * g) % p;

            if (value == 1) {
                return i == p - 1;
            }
        }

        return false;
    }

    // Read an integer without terminating on invalid input
    static int readInt(String message) {

        while (true) {
            System.out.print(message);

            if (sc.hasNextInt()) {
                return sc.nextInt();
            }

            System.out.println(
                "Invalid input! Please enter an integer."
            );

            sc.next();
        }
    }

    // Read a prime number
    static int readPrime() {

        while (true) {

            int p = readInt(
                "Enter prime number p (greater than 2): "
            );

            if (p > 2 && isPrime(p)) {
                return p;
            }

            System.out.println(
                "Invalid input! Enter a prime number greater than 2."
            );
        }
    }

    // Read a valid primitive root
    static int readPrimitiveRoot(int p) {

        while (true) {

            int g = readInt("Enter primitive root g: ");

            if (isPrimitiveRoot(g, p)) {
                return g;
            }

            System.out.println(
                "Invalid primitive root! Please enter again."
            );
        }
    }

    // Read a value within a specified range
    static int readRange(String message, int min, int max) {

        while (true) {

            int value = readInt(message);

            if (value >= min && value <= max) {
                return value;
            }

            System.out.println(
                "Invalid value! Enter a number from "
                + min + " to " + max + "."
            );
        }
    }

    // ---------------- ENCRYPTION ----------------
    static void encryption() {

        System.out.println(
            "\n========== ELGAMAL ENCRYPTION =========="
        );

        int p = readPrime();

        int g = readPrimitiveRoot(p);

        // Private key x
        int x = readRange(
            "Enter private key x (1 to " + (p - 2) + "): ",
            1, p - 2
        );

        // Generate public key y = g^x mod p
        long y = modPower(g, x, p);

        System.out.println("\nPublic key: (p, g, y)");
        System.out.println("p = " + p);
        System.out.println("g = " + g);
        System.out.println("y = g^x mod p = " + y);

        // Message
        int m = readRange(
            "\nEnter message m (0 to " + (p - 1) + "): ",
            0, p - 1
        );

        // Random/ephemeral key k
        int k = readRange(
            "Enter encryption key k (1 to " + (p - 2) + "): ",
            1, p - 2
        );

        // c1 = g^k mod p
        long c1 = modPower(g, k, p);

        // Shared secret = y^k mod p
        long shared = modPower(y, k, p);

        // c2 = m * shared mod p
        long c2 = (m * shared) % p;

        System.out.println(
            "\n---------- ENCRYPTION STEPS ----------"
        );

        System.out.println("Private key x = " + x);
        System.out.println("Message m = " + m);
        System.out.println("Encryption key k = " + k);

        System.out.println(
            "c1 = g^k mod p = " + c1
        );

        System.out.println(
            "Shared secret = y^k mod p = " + shared
        );

        System.out.println(
            "c2 = m * shared secret mod p = " + c2
        );

        System.out.println("\nEncrypted ciphertext:");
        System.out.println("(c1, c2) = (" + c1 + ", " + c2 + ")");
    }

    // ---------------- DECRYPTION ----------------
    static void decryption() {

        System.out.println(
            "\n========== ELGAMAL DECRYPTION =========="
        );

        int p = readPrime();

        // Private key x
        int x = readRange(
            "Enter private key x (1 to " + (p - 2) + "): ",
            1, p - 2
        );

        // Receive ciphertext
        int c1 = readRange(
            "Enter ciphertext c1 (1 to " + (p - 1) + "): ",
            1, p - 1
        );

        int c2 = readRange(
            "Enter ciphertext c2 (0 to " + (p - 1) + "): ",
            0, p - 1
        );

        // Shared secret = c1^x mod p
        long shared = modPower(c1, x, p);

        // Multiplicative inverse = shared^(p-2) mod p
        long inverse = modPower(shared, p - 2, p);

        // Original message = c2 * inverse mod p
        long m = (c2 * inverse) % p;

        System.out.println(
            "\n---------- DECRYPTION STEPS ----------"
        );

        System.out.println(
            "Shared secret = c1^x mod p = " + shared
        );

        System.out.println(
            "Inverse of shared secret = " + inverse
        );

        System.out.println(
            "m = c2 * inverse mod p"
        );

        System.out.println(
            "m = " + c2 + " * " + inverse
            + " mod " + p + " = " + m
        );

        System.out.println("\nDecrypted message = " + m);
    }

    // ---------------- MAIN MENU ----------------
    public static void main(String[] args) {

        while (true) {

            System.out.println(
                "\n========== ELGAMAL CRYPTOSYSTEM =========="
            );

            System.out.println("1. Encryption");
            System.out.println("2. Decryption");
            System.out.println("3. Exit");

            int choice = readRange(
                "Enter your choice: ", 1, 3
            );

            switch (choice) {

                case 1:
                    encryption();
                    break;

                case 2:
                    decryption();
                    break;

                case 3:
                    System.out.println(
                        "Program terminated. Goodbye!"
                    );
                    sc.close();
                    return;
            }
        }
    }
}
