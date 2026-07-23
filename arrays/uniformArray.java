class Solution {
    public boolean uniformArray(int[] nums) {
        //finding smallest odd
        int minodd=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                minodd=Math.min(minodd,nums[i]);
            }
        }
        //if all are odd
        if(minodd==Integer.MAX_VALUE) return true;
        // if even can become odd
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]<=minodd){
                return false;
            }
        }
        return true;
    }
}
