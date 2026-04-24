class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(nums[i],max);
        }
        int arr[]=new int[max-min+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]-min]++;
        }
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length/3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>n){
                list.add(i+min);
            }
        }
        return list;
    }
}
