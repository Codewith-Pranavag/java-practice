class Solution {
    public static boolean checkprime(int n){
        if(n==1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i<=n/2;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(checkprime(count)) return true;
        }
        return false;
        
    }
}