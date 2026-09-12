class Solution {
    public int solutions(int nums[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0;
        int r=0;
        int ans=0;
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0) map.remove(nums[l]);
                l++;
            }
            ans+=r-l+1;
            r++;
        }
        return ans;
    }
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int k=set.size();
        return solutions(nums,k)-solutions(nums,k-1);
        
    }
}
