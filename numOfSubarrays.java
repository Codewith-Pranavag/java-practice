class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0;
        int r=0;
        int ans=0;
        int sum=0;
        while(r<arr.length){
            sum+=arr[r];
            if(r-l+1==k){
                if(sum/k >=threshold) ans++;
                sum-=arr[l];
                l++;
            }
            r++;
        }
        return ans;
    }
}
