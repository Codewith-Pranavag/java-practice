import java.math.BigInteger;
import java.util.Scanner;

public class ElGamal {

    // Fast modular exponentiation (already provided natively by BigInteger)
    static BigInteger modPow(BigInteger base, BigInteger exponent, BigInteger mod) {
        return base.modPow(exponent, mod);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Public parameters
        System.out.print("Enter prime p: ");
        BigInteger p = sc.nextBigInteger();

        System.out.print("Enter primitive root g: ");
        BigInteger g = sc.nextBigInteger();

        // Private key (1 <= x <= p-2)
        System.out.print("Enter private key x: ");
        BigInteger x = sc.nextBigInteger();

        // Public key: h = g^x mod p
        BigInteger h = modPow(g, x, p);

        System.out.println("\nPublic Key: (p = " + p + ", g = " + g + ", h = " + h + ")");
        System.out.println("Private Key: x = " + x);

        // Message
        System.out.print("\nEnter message M (0 <= M < p): ");
        BigInteger M = sc.nextBigInteger();

        // Random k
        System.out.print("Enter random k (1 <= k <= p-2 and coprime to p-1): ");
        BigInteger k = sc.nextBigInteger();

        // FIX 1: Corrected k bounds check and added Coprime check
        BigInteger pMinusOne = p.subtract(BigInteger.ONE);
        BigInteger pMinusTwo = p.subtract(BigInteger.TWO);

        if (k.compareTo(BigInteger.ONE) < 0 || k.compareTo(pMinusTwo) > 0) {
            System.out.println("Invalid k! Must be between 1 and p-2.");
            sc.close();
            return;
        }
        
        // k must be coprime to (p-1) so that its inverse exists if needed (standard ElGamal requirement)
        if (!k.gcd(pMinusOne).equals(BigInteger.ONE)) {
            System.out.println("Invalid k! k must be coprime to (p-1).");
            sc.close();
            return;
        }

        // Encryption
        // C1 = g^k mod p
        BigInteger c1 = modPow(g, k, p);

        // C2 = (M * h^k) mod p
        BigInteger c2 = M.multiply(modPow(h, k, p)).mod(p);

        System.out.println("\n--- Encryption ---");
        System.out.println("C1 = " + c1);
        System.out.println("C2 = " + c2);
        System.out.println("Ciphertext = (" + c1 + ", " + c2 + ")");

        // Decryption
        // s = C1^x mod p
        BigInteger s = modPow(c1, x, p);

        // s^(-1) mod p
        BigInteger sInverse = s.modInverse(p);

        // M = (C2 * s^(-1)) mod p
        BigInteger decryptedM = c2.multiply(sInverse).mod(p);

        System.out.println("\n--- Decryption ---");
        System.out.println("Shared Secret s = " + s);
        System.out.println("s^(-1) mod p = " + sInverse);
        System.out.println("Decrypted Message M = " + decryptedM);

        sc.close();
    }
}
