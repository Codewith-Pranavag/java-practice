class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int boat=0;
        while(left<=right){
            if(arr[left]+arr[right]<=limit){
                left++;
            }
            right--;
            boat++;
        }
        return boat;
        
    }
}
