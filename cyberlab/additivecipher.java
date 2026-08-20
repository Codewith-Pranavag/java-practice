//.additive cipher
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
        while(!isnumvalid(k)){
            System.out.print("Enter the key again\n");
            k=sc.next();
        }
        int key=Integer.valueOf(k);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                sb.append(' ');
            }
            else{
                char chnew=(char)('a'+((ch-'a' +key)%26));
                sb.append(chnew);
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
        while(!isnumvalid(k)){
            System.out.print("Enter the key again\n");
            k=sc.next();
        }
        int key=Integer.valueOf(k);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                sb.append(' ');
            }
            else{
                char chnew=(char)('A'+(ch-'A' -key +26)%26);
                sb.append(chnew);
            }
        }
        String s=sb.toString();
        s=s.toLowerCase();
        System.out.println("The plain text is : \n" + s);
    }
    public static void check(String str,int key){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                sb.append(' ');
            }
            else{
                char chnew=(char)('A'+(ch-'A' -key +26)%26);
                sb.append(chnew);
            }
        }
        String s=sb.toString();
        s=s.toLowerCase();
        System.out.println(s);
    }
    public static void bruteforce(){
         System.out.println("Enter the CYPHER TEXT");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        while(!isvalidd(str)){
            System.out.println("Invalid re enter: \n");
            str=sc.nextLine();
        }
        for(int i=0;i<25;i++){
            check(str,i);
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the options: \n 1. Encryption \n 2. Decryption \n 3. Bruteforce \n 4. Exit \n");
        //checking if the input if valid or not;
        int opt=-1;
        do{
           System.out.print(" 1. Encryption \n 2. Decryption \n 3. Bruteforce \n 4. Exit \n Enter the options: \n ");
           opt=sc.nextInt();
            if(opt==1){
                encryption();
            }
            else if(opt==2){
                decryption();
            }
            else if(opt==3){
                bruteforce();
            }
            else if(opt>4){
                System.out.println("Invalid choice enter again : ");

            }
        } while(opt!=4);
        System.out.println("EXIT SUCCESSFUL");

    }
}
