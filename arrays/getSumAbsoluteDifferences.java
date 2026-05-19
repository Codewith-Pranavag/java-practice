class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=nums[0];
        right[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            left[i]=nums[i]+left[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=nums[i]+right[i+1];
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int leftsum=i*nums[i]-left[i];
            int rightsum=right[i]-(n-i-1)*nums[i];
            ans[i]=leftsum+rightsum;
        }
        return ans;
    }
}
