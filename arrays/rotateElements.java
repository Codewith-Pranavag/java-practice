class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int num:nums){
            if(num>=0){
                count++;
            }
        }
        if(count<=1){
            return nums;
        }
        int temp[]=new int[count];
        int idx=0;
        for(int num:nums){
            if(num>=0){
                temp[idx++]=num;
            }
        }
        k= k % count;
        int rotated[]=new int[count];
        int pos=0;
        for(int i=k;i<count;i++){
            rotated[pos++]=temp[i];
        }
        for(int i=0;i<k;i++){
            rotated[pos++]=temp[i];
        }
        idx=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                nums[i]=rotated[idx++];
            }
        }
        return nums;
    }
}
