class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        int l=0;
        int index=0;
        int r=0;
        while(r<n){
            while(!dq.isEmpty() && dq.peekLast()<nums[r]){
                dq.pollLast();
            }
            dq.addLast(nums[r]);
            if(r-l+1==k){
                ans[index++]=dq.peekFirst();
                if(!dq.isEmpty() && dq.peekFirst()==nums[l]){
                    dq.pollFirst();
                }
                l++;
            }
            r++;
        }
        return ans;
    }
}
