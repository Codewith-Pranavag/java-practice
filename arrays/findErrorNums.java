class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int freq[]=new int [n];
        for(int i=0;i<n;i++){
            freq[nums[i]-1]++;
        }
        int ans[]=new int[2];
        for(int j=0;j<n;j++){
            if(freq[j]>1){
                ans[0]=j+1;
            }
            else if(freq[j]==0){
                ans[1]=j+1;
            }
        }
        return ans;
    }
}
