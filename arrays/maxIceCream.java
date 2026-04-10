class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<costs.length;i++){
            max=Math.max(max,costs[i]);
            min=Math.min(min,costs[i]);
        }
        int freq[]=new int[max-min+1];
        for(int i=0;i<costs.length;i++){
            freq[costs[i]-min]++;
        }
        int j=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                costs[j]=i+min;
                freq[i]--;
                j++;
            }
        }
        int count=0;
        int sum=0;
        for(int i=0;i<costs.length;i++){
            sum+=costs[i];
            if(sum<=coins) count++;
            else{
                break;
            }
        }
        return count;
    }
}
