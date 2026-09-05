class Solution {
    public int minimumCardPickup(int[] cards) {
        int r=0;
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<cards.length){
            if(!map.containsKey(cards[r])){
                map.put(cards[r],r);
            }
            else if(map.containsKey(cards[r])){
                int len=r-map.get(cards[r])+1;
                min=Math.min(min,len);
                map.put(cards[r],r);
            }
            r++;
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
}
