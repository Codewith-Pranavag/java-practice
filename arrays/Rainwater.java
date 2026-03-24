//Trapping the rain water;
import java.util.*;
public class Rainwater{
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        //aE lftmax
        int n=arr.length;
        int lftmax[]=new int[n];
        lftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            lftmax[i]=Math.max(arr[i],lftmax[i-1]);
        }
        //aE rghtmax
        int rgtmax[]=new int[n];
        rgtmax[n-1]=arr[n-1];
        for(int j=n-2;j>=0;j--){
            rgtmax[j]=Math.max(arr[j],rgtmax[j+1]);
        }
        int rainwater=0;
        for(int k=0;k<n;k++){
            int waterlevel=Math.min(lftmax[k],rgtmax[k]);
            rainwater+=(waterlevel-arr[k])  ;
        }
        System.out.print(rainwater);

    }
}