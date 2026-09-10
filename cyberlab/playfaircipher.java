//play fair
import java.util.*;
public class cyber{
    public static boolean isvalidplain(String s){
        return s.matches("[a-z ]+");
    }
    public static boolean isvalid(String s){
        return s.matches("[A-Z ]+");
    }
    public static boolean isnumvalid(String text){
     return text.matches("\\d+"); // Returns true
    }
    public static void encryption(){
        //take the plain text;[should not contain the A-Z0-9*/76];
         System.out.print("Enter the plain text:  \n");
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        while(!isvalidplain(s)){
            System.out.print("RE ENter the plain text: \n");
            s=sc.nextLine();
        }
        System.out.print("Enter the key \n");
        String k=sc.next();
        while(!isvalid(k)){
            System.out.print("Enter the key again\n");
            k=sc.next();
        }
        String key=k;
        StringBuilder sb=new StringBuilder();
         //prepare the matrix;
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(char ch:key.toCharArray()){
          set.add(ch);
        }
        for(char ch='A';ch<='Z';ch++){
          if(set.contains('I') && ch=='J') continue;
          if(set.contains('J') && ch=='I') continue;
          if(set.contains(ch)) continue;
          else{
            set.add(ch);
          }
        }
        for(char x:set){
          sb.append(x);
        }
        int z=0;
        char matrix[][]=new char[5][5];
        for(int i=0;i<5;i++){
          for(int j=0;j<5;j++){
            matrix[i][j]=sb.charAt(z);
            z++;
          }
        }
        for(int i=0;i<5;i++){
          for(int j=0;j<5;j++){
            System.out.print( matrix[i][j]);
          }
          System.out.println();
        }
        String strnew=sb.toString();
        StringBuilder st=new StringBuilder();
        st.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
          if(s.charAt(i)==s.charAt(i-1)){
            st.append('z');
            st.append(s.charAt(i));
          }
          else{
            st.append(s.charAt(i));
          }
        }
        if(st.length()%2!=0){
          st.append('z');
        }
        System.out.println(st);
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch==' '){
        //         sb.append(' ');
        //     }
        //     else{
        //         char chnew=(char)('a'+((ch-'a' +key)%26));
        //         sb.append(chnew);
        //     }
        // }
        // String strnew=sb.toString();
        // strnew=strnew.toUpperCase();
        // System.out.println (strnew);
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
