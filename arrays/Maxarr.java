//Program to calculate maximum in a array;
import java.util.*;
public class Maxarr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            int temp=sc.nextInt();
            arr[i]=temp;
        }        
        int max=Integer.MIN_VALUE;
        for(int j=0;j<arr.length;j++){
            max=Math.max(arr[j],max);
        }
        System.out.print("Max from the array is : "+  max);
    }
}