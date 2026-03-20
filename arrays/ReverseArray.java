//Program to reverse a array;
import java.util.*;
public class ReverseArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            int temp=sc.nextInt();
            arr[i]=temp;
        }
        for(int j=0;j<arr.length/2;j++){
            int temp=arr[j];
            arr[j]=arr[n-1-j];
            arr[n-1-j]=temp;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k] +" ");
        }
    }
}