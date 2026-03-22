class Solution {
    public int searchInsert(int[] nums, int target) {
        int res=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
               return i;

            }
            else if(nums[i]!=target && nums[i]<target){
                res=i;
            }

        }
        return res+1;
        
    }
}