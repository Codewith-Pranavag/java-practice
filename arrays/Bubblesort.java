//BUBBLE SORT;
import java.util.*;
public class Bubblesort{
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                }
            }
           
        }
    }
}