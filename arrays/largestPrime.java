class Solution {
    public int largestPrime(int n) {
        boolean isprime[]=new boolean[n+1];
        for(int i=0;i<=n;i++){
            isprime[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(isprime[i]){
                for(int j=i*i;j<=n;j=j+i){
                    isprime[j]=false;

                }
            }
        }
        int ans=0;
        int sum=0;
        for(int i=2;i<=n;i++){
            if(isprime[i]){
                sum+=i;
            }
            if(sum>n){
                break;
            }
            if(isprime[sum]){
                ans=sum;
            }
        }
        return ans;
    }
}
