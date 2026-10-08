class Solution {
    public boolean isDigitorialPermutation(int n) {
        int fact[]=new int[10];
        fact[0]=1;
        for(int i=1;i<fact.length;i++){
            fact[i]=fact[i-1]*i;
        }
        int orignal=n;
        int sum=0;
        while(n>0){
            sum+=fact[n%10];
            n=n/10;
        }
        int freq1[]=new int[10];
        int freq2[]=new int[10];
        while(orignal>0){
            freq1[orignal%10]++;
            orignal/=10;
        }
        while(sum>0){
            freq2[sum%10]++;
            sum/=10;
        }
        for(int i=0;i<10;i++){
            if (freq1[i]!=freq2[i]) return false;
        }
        return true;
    }
}
