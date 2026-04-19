class Solution {
    public int[] finalPrices(int[] prices) {
        int arr[]=new int[prices.length];
        int k=0;
        for(int i=0;i<prices.length;i++){
            int j=i+1;
            while(j<prices.length){
                if(j>i && prices[j]<=prices[i]){
                    arr[i]=prices[i]-prices[j];
                    break;
                }
                else{
                    arr[i]=prices[i];
                }
                j++;

            }
        }
        arr[arr.length-1]=prices[prices.length-1];
        return arr;
        
    }
}
