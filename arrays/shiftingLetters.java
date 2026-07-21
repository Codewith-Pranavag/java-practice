class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n=shifts.length;
        long left[]=new long[n];
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                left[i]=shifts[i];
            }
            else{
                left[i]=shifts[i]+left[i+1];
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<left.length;i++){
            char ch=s.charAt(i);
            sb.append((char)((ch-'a'+left[i])%26 +'a'));
        }
        return sb.toString();
    }
}
