class Solution {
    public String smallestPalindrome(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder left=new StringBuilder();
        StringBuilder middle=new StringBuilder();
        for(int i=0;i<freq.length;i++){
            int count=freq[i];
            if(count%2!=0){
                middle.append((char)(i+'a'));
                count--;
            }
            for(int j=0;j<count/2;j++){
                left.append((char)(i+'a'));
            }
        }
        StringBuilder sb=new StringBuilder();
        sb.append(left);
        sb.append(middle);
        sb.append(left.reverse());
        return sb.toString();
        
        
    }
}
