class Solution {
    public boolean ispossible(int weights[],int days,int capacity){
        int day=1;
        int sum=0;
        for(int w:weights){
            if(sum+w>capacity){
                day++;
                sum=0;
            }
            sum+=w;
        }
        return day<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        int ans=-1;
        int total=0;
        for(int i=0;i<weights.length;i++){
            max=Math.max(weights[i],max);
            total+=weights[i];
        }
        int r=total;
        int l=max;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ispossible(weights,days,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}
