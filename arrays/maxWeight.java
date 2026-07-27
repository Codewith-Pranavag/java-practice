class Solution {
    public long maxWeight(int[] pizzas) {
        long result=0;
        Arrays.sort(pizzas);
        int n=pizzas.length;
        int day=n/4;
        int last=n-1;
        int odd=(day+1)/2;
        int even=day-odd;
        for(day=1;day<=odd;day++){
            result+=pizzas[last];
            last--;
        }
        for(day=1;day<=even;day++){
            last--;
            result+=pizzas[last];
            last--;
        }
        return result; 
    }
}
