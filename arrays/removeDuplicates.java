class Solution {
    public int removeDuplicates(int[] nums) {
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
            int c=0;
            while(freq[i]>0){
                if(c==2) break;
                nums[j++]=i+min;
                c++;
                freq[i]--;
            }
        }
        return j;   
    }
}
