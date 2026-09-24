//.vegnere cipher
import java.util.*;
public class cyber{
    public static boolean isvalid(String s){
        return s.matches("[a-z ]+");
    }
    public static boolean isnumvalid(String text){
     return text.matches("\\d+"); // Returns true
    }
    public static void encryption(){
        //take the plain text;[should not contain the A-Z0-9*/76];
         System.out.print("Enter the plain text:  \n");
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        while(!isvalid(s)){
            System.out.print("RE ENter the plain text: \n");
            s=sc.nextLine();
        }
        System.out.print("Enter the key \n");
        String k=sc.next();
        while(!isvalid(k)){
            System.out.print("Enter the key again\n");
            k=sc.next();
        }
        int keyindex=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char chh=s.charAt(i);
            if(chh==' '){
                sb.append(' ');
            }
            else{
                int ch=s.charAt(i)-'a';
                int ch_key=k.charAt(keyindex%k.length())-'a';
                char chnew=(char)('a'+((ch+ch_key)%26));
                sb.append(chnew);
                keyindex++;
            }
        }
        String strnew=sb.toString();
        strnew=strnew.toUpperCase();
        System.out.println (strnew);
    }
    public static boolean isvalidd(String str){
        return str.matches("[A-Z ]+");
    }
    public static void decryption(){
        //taking the input of cypher txt;
        System.out.println("Enter the CYPHER TEXT");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        while(!isvalidd(str)){
            System.out.println("Invalid re enter: \n");
            str=sc.nextLine();
        }
       System.out.print("Enter the key \n");
        String k=sc.next();
        while(!isvalid(k)){
            System.out.print("Enter the key again\n");
            k=sc.next();
        }
        StringBuilder sb=new StringBuilder("");
        int keyindex=0;
        for(int i=0;i<str.length();i++){
            char chh=str.charAt(i);
            if(chh==' '){
                sb.append(' ');
            }
            else{
                int ch=str.charAt(i)-'A';
                int ch_key=k.charAt(keyindex%k.length())-'a';
                char chnew=(char)('a'+((ch-ch_key+26)%26));
                sb.append(chnew);
                keyindex++;
            }
        }
        String s=sb.toString();
        s=s.toLowerCase();
        System.out.println("The plain text is : \n" + s);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the options: \n 1. Encryption \n 2. Decryption \n 3. Bruteforce \n 4. Exit \n");
        //checking if the input if valid or not;
        int opt = -1;
        String o;

        do {

            System.out.print(
                "1. Encryption \n"
                + "2. Decryption \n"
                + "3. Exit \n"
                + "Enter the options: \n"
            );
            o=sc.next();
            while(!isnumvalid(o)){
              System.out.print("renter the options \n");
              o=sc.next();
            }
            opt=Integer.valueOf(o);
            if(opt==1){
                encryption();
            }
            else if(opt==2){
                decryption();
            }
            else if(opt>4){
                System.out.println("Invalid choice enter again : ");

            }
        } while(opt!=3);
        System.out.println("EXIT SUCCESSFUL");

    }
}
