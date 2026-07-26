class Solution {
    public long perfectPairs(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long ans=0;
        int end=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            while(end<n && nums[end]<=2*nums[i]){
                end+=1;
                ans+=end-i-1;
            }
        }
        return ans;
    }
}
