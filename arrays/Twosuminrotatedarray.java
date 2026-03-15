
import java.util.*;
public class Twosuminrotatedarray{
    public static void main(String args[]){
        int arr[]={11,15,6,8,9,10};
        int target=16;
        int piviot=0;
        int n=arr.length;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                piviot=i;
            }

        }
        int flag=0;
        int rp=piviot;
        int lp=piviot+1;
        while(lp!=rp){
            if(arr[lp]+arr[rp]==target){
                flag=1;
                break;

            }
            else if(arr[lp]+arr[rp]<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;

            }
        
        }
        if(flag==1){
            System.out.print("yes");
        }

    }
}