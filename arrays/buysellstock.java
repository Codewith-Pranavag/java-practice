//BuySellStock;
import java.util.*;
public class buysellstock{
    public static void main(String args[]){
        int arr[]={7,1,5,3,6,4};
        int buyprice=arr[0];
        int profit=0;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<buyprice){
                buyprice=arr[i];
            }
            else{
                profit=arr[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
        }
        System.out.print(maxprofit);
    }
}