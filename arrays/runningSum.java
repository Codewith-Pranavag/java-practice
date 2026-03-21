import java.util.*;

public class sumofn{
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        int res[]=new int[arr.length];
        res[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            int sum=arr[i]+res[i-1];
            res[i]=sum;
        }
    }
}