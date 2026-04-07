class Solution {
    public int mostFrequentEven(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
        int freq[]=new int[max-min+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]-min]++;
        }
        int max1=-1;
        for(int i=0;i<freq.length;i++){
            if((i+min)%2==0 && freq[i]>0){
                max1=Math.max(max1,freq[i]);
            }
        }
         for(int i=0;i<freq.length;i++){
            if(((i+min)%2==0) && freq[i]>0 && max1==freq[i]) return i+min;
        }
        return -1;
    }
}
