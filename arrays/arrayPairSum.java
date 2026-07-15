class Solution {
    public int arrayPairSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int freq[]=new int[max-min+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]-min]++;
        }
        int j=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                nums[j]=i+min;
                freq[i]--;
                j++;
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i+=2){
            count+=nums[i];
        }
        return count;
    }
}
