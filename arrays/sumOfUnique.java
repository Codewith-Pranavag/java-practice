class Solution {
    public int sumOfUnique(int[] nums) {
        if(nums.length==1) return nums[0];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(nums[i],max);
        }
        int freq[]=new int[max-min+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]-min]++;
        }
        int c=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                int n=i+min;
                c+=n;
            }
        }
        return c;
        
    }
}
