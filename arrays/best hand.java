class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        boolean flush=true;
        for(int i=1;i<suits.length;i++){
            if(suits[i]!=suits[i-1]){
            flush=false;
            break;
            }
        }
        if(flush) return "Flush";
        int freq[]=new int[14];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ranks.length;i++){
            freq[ranks[i]]++;
            max=Math.max(freq[ranks[i]],max);
        }
        if(max>=3) return "Three of a Kind";
        if(max==2) return "Pair";
        return "High Card";

    }
}
