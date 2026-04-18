class Solution {
    public int[] buildArray(int[] nums) {
        int newint[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            newint[i]=nums[nums[i]];
        }
        return newint;
        
    }
}
