//multiplicative cipher
import java.util.*;

public class Main {
  public static boolean isnumvalid(String text){
     return text.matches("\\d+") && iskeyvalid(Integer.valueOf(text)); // Returns true
    }
    public static boolean isnumOPT(String text){
     return text.matches("\\d+") ;
    }

    public static boolean isvalid(String s) {
        return s.matches("[a-z ]+");
    }
    public static boolean iskeyvalid(int n){
         int a = n;
    int b = 26;

    while (b != 0) {
        int r = a % b;
        a = b;
        b = r;
    }

    return a == 1;
    }
    public static void encryption() {

        // Take the plain text; should not contain A-Z, 0-9, *, /, etc.
        System.out.print("Enter the plain text: \n");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        while (!isvalid(s)) {
            System.out.print("RE Enter the plain text: \n");
            s = sc.nextLine();
        }

        System.out.print("Enter the key \n");
        String k1 = sc.next();
        while(!isnumvalid(k1)){
          System.out.print("Enter the key1 invalid found: \n");
          k1=sc.next();
        }
        int key=Integer.valueOf(k1);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == ' ') {
                sb.append(' ');
            } else {
                int p = (int) (ch - 'a');

                char chnew = (char) ('a' + (p * key) % 26);

                sb.append(chnew);
            }
        }

        String strnew = sb.toString();
        strnew = strnew.toUpperCase();

        System.out.println(strnew);
    }

    public static boolean isvalidd(String str) {
        return str.matches("[A-Z ]+");
    }

    public static int findinv(int K) {

        // Map K to a positive number within 0-25 range
        K = (K % 26 + 26) % 26;

        // Loop through all 25 possible cipher shifts
        for (int K_inv = 1; K_inv < 26; K_inv++) {

            if ((K * K_inv) % 26 == 1) {
                return K_inv;
            }
        }

        return -1; // K is invalid (e.g., even or 13)
    }

    public static void decryption() {

        Scanner sc = new Scanner(System.in);

        // Taking the input of cipher text
        System.out.println("Enter the CYPHER TEXT");

        String str = sc.nextLine();

        while (!isvalidd(str)) {
            System.out.println("Invalid re enter: \n");
            str = sc.nextLine();
        }
        System.out.print("Enter the key: \n");
        String k1 = sc.next();
        while(!isnumvalid(k1)){
          System.out.print("Enter the key invalid found: \n");
          k1=sc.next();
        }
        int key=Integer.valueOf(k1);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ') {
                sb.append(' ');
            } else {
                int c = (int) (ch - 'A');

                int kinv = findinv(key);

                char chnew = (char) ('a' + (c * kinv) % 26);

                sb.append(chnew);
            }
        }

        String s = sb.toString();
        s = s.toLowerCase();

        System.out.println("The plain text is : \n" + s);
    }

    public static void check(String str, int key) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ') {
                sb.append(' ');
            } else {
                int c = (int) (ch - 'A');

                int kinv = findinv(key);

                char chnew = (char) ('a' + (c * kinv) % 26);

                sb.append(chnew);
            }
        }

        String s = sb.toString();
        s = s.toLowerCase();

        System.out.println(s);
    }

    public static void bruteforce() {

        System.out.println("Enter the CYPHER TEXT");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        while (!isvalidd(str)) {
            System.out.println("Invalid re enter: \n");
            str = sc.nextLine();
        }

        for (int i = 0; i < 25; i++) {
            check(str, i);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // System.out.print(
        //     "Enter the options: \n"
        //     + "1. Encryption \n"
        //     + "2. Decryption \n"
        //     + "3. Bruteforce \n"
        //     + "4. Exit \n"
        // );

        // Checking if the input is valid or not
        int opt = -1;
        String o;

        do {

            System.out.print(
                "1. Encryption \n"
                + "2. Decryption \n"
                + "3. Bruteforce \n"
                + "4. Exit \n"
                + "Enter the options: \n"
            );
            o=sc.next();
            while(!isnumOPT(o)){
              System.out.print("renter the options \n");
              o=sc.next();
            }
            opt=Integer.valueOf(o);

            if (opt == 1) {

                encryption();

            } else if (opt == 2) {

                decryption();

            } else if (opt == 3) {

                bruteforce();

            } else if (opt > 4) {

                System.out.println("Invalid choice enter again : ");
            }

        } while (opt != 4);

        System.out.println("EXIT SUCCESSFUL");
    }
}
