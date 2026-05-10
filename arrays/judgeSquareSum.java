class Solution {
    public boolean judgeSquareSum(int c) {
        long ans=(long)c;
        long st=0;
        long en=(long)Math.sqrt(c);
        while(st<=en){
            if(st*st + en*en==c) return true;
            else if(st*st +en*en<c){
                st++;
            }
            else {
                en--;
            }
        }
        return false;
        
    }
}
