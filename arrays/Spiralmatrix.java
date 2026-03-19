//to print spiral of a matrix
import java.util.*;
public class Spiralmatrix{
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sc=0;
        int sr=0;
        int er=arr.length-1;
        int ec=arr[0].length-1;
        while(sr<=er && sc<=ec){
        for(int p=sc;p<=ec;p++){
            System.out.print(arr[sr][p] + " ");
        }
        for(int q=sr+1;q<=er;q++){
            System.out.print(arr[q][ec] + " ");
        }
        for(int r=ec-1;r>=sc;r--){
            System.out.print(arr[er][r] + " ");
        }
        for(int s=er-1;s>sc;s--){
            System.out.print(arr[s][sc]+ " ");
        }
        sr++;
        sc++;
        ec--;
        er--;
    }
    }
}