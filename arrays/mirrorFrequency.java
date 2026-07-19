class Solution {
    public int mirrorFrequency(String s) {
        int alpha[]=new int[26];
        int num[]=new int[10];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num[ch-'0']++;
            }
            else{
                alpha[ch-'a']++;
            }
        }
        int ans=0;
        int left=0;
        int right=alpha.length-1;
        while(left<=right){
            ans+=Math.abs(alpha[left]-alpha[right]);
            right--;
            left++;
        }
        left=0;
        right=9;
        while(left<=right){
            ans+=Math.abs(num[left]-num[right]);
            right--;
            left++;
        }
        return ans;
    }
}
