//Program to search in a sorted array;
import java.util.*;
public class BinarySearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            int temp=sc.nextInt();
            arr[i]=temp;
        }
        int flag=sc.nextInt();
        int start=0;
        int pos=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid]==flag){
                pos=mid;
                break;
            }
            else if(flag>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.print(pos);
    }
}