class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int r=0;
        int l=0;
        long ans=0;
        long sum=0;
        HashSet<Integer> set=new HashSet<>();
        while(r<nums.length){
            while(set.contains(nums[r])){
                sum-=nums[l];
                set.remove(nums[l]);
                l++;
            }
            set.add(nums[r]);
            sum+=nums[r];
            if(r-l+1==k){
                ans=Math.max(ans,sum);
                sum-=nums[l];
                set.remove(nums[l]);
                l++;
            }
            r++;
        }
        return ans;
    }
}
