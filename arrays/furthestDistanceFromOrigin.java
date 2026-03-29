class Solution {
    public int furthestDistanceFromOrigin(String str) {
        int countl=0;
        int countr=0;
        int spaces=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='R') countr++;
            else if(c=='L') countl++;
            else{
                spaces++;
            }
        }
        return Math.abs(countr-countl)+spaces;
    }
}