class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer> seen=new HashSet<>();
        Set<String> unique=new HashSet<>();
        for(int num:nums){
            if(seen.contains(num-k)){
                unique.add((num-k)+","+num);
            }
            if(seen.contains(num+k)){
                unique.add(num+","+(num+k));
            }
            seen.add(num);
        }
        return unique.size(); 
    }
}
