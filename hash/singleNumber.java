class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer > map=new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        } 
        for(Integer key: map.keySet()){
            if(map.get(key)==1) l.add(key);
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}
