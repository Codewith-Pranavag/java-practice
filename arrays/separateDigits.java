class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String temp=String.valueOf(nums[i]);
            int n=temp.length();
            int j=0;
            while(j<n){
                list.add(Integer.valueOf(temp.charAt(j)-'0'));
                j++;
            }
        }
       return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
