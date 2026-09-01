class Solution {
    public int maxScore(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int right=nums.length-1;
        int max=sum;
        for(int i=k-1;i>=0;i--){
            sum=sum-nums[i];
            sum+=nums[right];
            right--;
            max=Math.max(sum,max);
        }
        return max;

        
    }
}
