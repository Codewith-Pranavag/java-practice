import java.util.*;
public class LinearSearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            int temp=sc.nextInt();
            arr[i]=temp;
        }        
        int flag=sc.nextInt();
        int pos=0;
        boolean isfound=false;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==flag){
                isfound=true;
                pos=j;
            }
        }
        if(isfound){
            System.out.print("Element found at index "+ pos);
        }
        else{
            System.out.print("Invalid input");
        }
    }
}