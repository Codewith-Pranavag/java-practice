class Solution {
    public int maxRotateFunction(int[] nums) {
        long sum=0;
        long f=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            f+=nums[i]*i;
        }
        long max=f;
        for(int i=nums.length-1;i>0;i--){
            f=f+sum-nums.length*nums[i];
            max=Math.max(max,f);
        }
        return (int)max;
    }
}
