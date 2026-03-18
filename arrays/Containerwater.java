//Container with most water 
import java.util.*;
public class Containerwater{
    public static void main(String args[]){
        int arr[]={1,8,6,2,5,4,8,};
        int currvol=1;
        int maxvol=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int tempwidth=j-i;
                int tempheight=Math.min(arr[i],arr[j]);
                currvol=tempheight*tempwidth;
                maxvol=Math.max(currvol,maxvol);
            }
        }
        System.out.print(maxvol);

    }
}