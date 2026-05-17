class Solution {
    public boolean ispalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(right)!=str.charAt(left)) return false;
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        String ans="";
        int max=0;
        for(int i=0;i<s.length();i++){
            int right=i+1;
            while(right<=s.length()){
                String temp=s.substring(i,right);
                if(ispalindrome(temp)){
                    if(temp.length()>max){
                        max=temp.length();
                        ans=temp;
                    }
                }
                right++;
            }
        }
        return ans;
        
    }
}
