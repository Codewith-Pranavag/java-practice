class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int minval=0;
        for(int i=0;i<nums.length;i++){
            int temp=Math.abs(nums[i]);
            if(temp==min){
                minval=Math.max(minval,nums[i]);
            }
            else{
                if(min>temp){
                    min=temp;
                    minval=nums[i];
                }
            }
        }
        return minval;  
    }
}
