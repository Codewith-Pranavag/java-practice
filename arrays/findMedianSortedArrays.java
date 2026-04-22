class Solution {
    public static int[] sort(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(arr[i],min);
        }
        int freq[]=new int[max-min+1];
        for(int j=0;j<arr.length;j++){
            freq[arr[j]-min]++;
        }
        int j=0;
        for(int x=0;x<freq.length;x++){
            while(freq[x]>0){
                arr[j]=x+min;
                j++;
                freq[x]--;
            }
        }
        return arr;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]=new int[m+n];
        int k=0;
        while(k<m){
            arr[k]=nums1[k];
            k++;
        }

        int l=0;
        while(l<n){
            arr[k]=nums2[l];
            k++;
            l++;
        }
        arr=sort(arr);
        if(arr.length%2==0){
        int temp=arr.length/2 -1;
        int temp1=arr.length/2;
        double ans=(arr[temp]+arr[temp1] )/2.0;
        return ans;
        }
        return (double)(arr[arr.length/2]);
        
    }
}
