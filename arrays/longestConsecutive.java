class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int currstreak=1;
        int maxstreak=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==(nums[i-1]+1)){
                    currstreak++;
                }
                else{
                    maxstreak=Math.max(currstreak,maxstreak);
                    currstreak=1;
                }
            }
        }
        return Math.max(currstreak,maxstreak);
    }
}
