class Solution {
    public String greatestLetter(String s) {
        if(s.length()==1) return "";
        for(int i='z' ;i>='a';i--){
            String lower=Character.toString(i);
            String upper=Character.toString(i-32);
            if(s.contains(lower) && s.contains(upper)){
                return upper;
            }
        }
        return "";
    }
}
