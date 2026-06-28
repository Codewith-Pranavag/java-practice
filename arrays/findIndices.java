class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int n=nums.length;
        int mini=0;
        int maxi=0;
        for(int i=indexDifference;i<n;i++){
            //update
            if(nums[i-indexDifference]<nums[mini]){
                mini=i-indexDifference;
            }
            if(nums[i-indexDifference]>nums[maxi]){
                maxi=i-indexDifference;
            }
            //check diff btw mini and maxi
            if(Math.abs(nums[i]-nums[mini])>=valueDifference) return new int[]{mini,i};
            if(Math.abs(nums[i]-nums[maxi])>=valueDifference) return new int []{maxi,i};
        }
        return new int []{-1,-1};
    }
}
