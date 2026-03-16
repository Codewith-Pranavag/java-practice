
import java.util.*;
public class InsertAtPositionArray{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos=sc.nextInt();
        int value=sc.nextInt();
        for(int k=n;k>pos;k--){
            arr[k]=arr[k-1];
        }
        arr[pos]=value;
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j] +" ");
        }
    }
}