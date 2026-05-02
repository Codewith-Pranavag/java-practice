class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int freq[]=new int [11];
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(n>0){
                int temp=n%10;
                freq[temp]++;
                n=n/10;
            }
        }
        return freq[digit];
    }
}
