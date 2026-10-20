class Solution {
    public int numberOfSubstrings(String s) {
        int l=0;
        int r=0;
        int freq[]=new int[3];
        int count=0;
        while(r<s.length())
        {
            freq[s.charAt(r)-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                count+=s.length()-r;
                freq[s.charAt(l)-'a']--;
                l++;
            }
            r++;
        }
        return count;
    }

}
