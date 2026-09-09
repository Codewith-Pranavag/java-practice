class Solution {
    public long countCommas(long n) {
        long comma=0;
        long min=1000;
        while(n>=min){
            comma+=(n-min+1);
            min=min*1000;
        }
        return comma;
    }
}
