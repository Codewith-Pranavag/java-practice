//to print spiral of a matrix
import java.util.*;
public class DiagonalSum{
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
        }
        System.out.print(sum);
    }
}