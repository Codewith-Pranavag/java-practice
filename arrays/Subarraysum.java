//Program to print max subarray sum (Bruteforce);
import java.util.*;
public class Subarraysum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,-2,6,-1,3};
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                sum=sum+arr[j];
            }
            max=Math.max(sum,max);
            sum=0;
        }
        System.out.print(max);
    }
}