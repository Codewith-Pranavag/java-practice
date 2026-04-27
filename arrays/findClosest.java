class Solution {
    public int findClosest(int x, int y, int z) {
        int t1=Math.abs(z-x);
        int t2=Math.abs(z-y);
        if(t1>t2) return 2;
        if(t1<t2) return 1;
        return 0;
    }
}
