class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int n=temperatures.length;
        int ans[]=new int[n];
        for(int i=0;i<temperatures.length;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int prev=s.pop();
                ans[prev]=i-prev;
            }
            s.push(i);
        }
        return ans;
    }
}
