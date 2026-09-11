class Solution {
    public boolean ispossible(int time[],int totalTrips,long mid){
        long z=0;
        for(int i=0;i<time.length;i++){
            z+=(mid/time[i]);
        }
        return z>=totalTrips;
    }
    public long minimumTime(int[] time, int totalTrips) {
        int max=Integer.MIN_VALUE;
        for(int t:time){
            max=Math.max(max,t);
        }
        long r=(long)max*totalTrips;
        long ans=-1;
        long l=1;
        while(l<=r){
            long mid=l+(r-l)/2;
            if(ispossible(time,totalTrips,mid)){
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
