//Container with most water O(n)
import java.util.*;
public class twoPointerContainerwater{
    public static void main(String args[]){
        // int arr[]={1,8,6,2,5,4,8,};
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);list.add(8);list.add(6);list.add(2);list.add(5);list.add(4);list.add(8);list.add(3);list.add(7);
        int lp=0;
        int rp=list.size()-1;
        int max=Integer.MIN_VALUE;
        while(lp<=rp){
            int width=rp-lp;
            int hgt=Math.min(list.get(lp),list.get(rp));
            int vol=hgt*width;
            max=Math.max(vol,max);
            if(list.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }



        }
        System.out.print(max);

    }
}