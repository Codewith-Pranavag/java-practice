class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int ans[]={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) {
                ans[0]=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target) {
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}
