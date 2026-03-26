import java.util.*;
public class lengthOflastWord{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        String temp=arr[arr.length-1];
        System.out.print(temp.length());


    }
}