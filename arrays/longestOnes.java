class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int max=Integer.MIN_VALUE;
        int arr[]=new int[2];
        while(r<nums.length){
           arr[nums[r]]++;
            while(arr[0]>k){
                arr[nums[l]]--;
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}
