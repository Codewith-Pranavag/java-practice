class Solution {
    public int longestValidParentheses(String str) {
        Stack <Integer> s=new Stack<>();
        s.push(-1);
        int max=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                s.push(i);
            }
            else{
                s.pop();
                if(s.isEmpty()){
                    s.push(i);
                }
                else{
                    max=Math.max(max,i-s.peek());
                }
            }
        }
        return max;
    }
}
