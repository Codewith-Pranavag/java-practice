class Solution {
    public int binsearch(int arr[],int target,int left ,int right){
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public int find(int arr[]){
        int right=arr.length-1;
        int ans=-1;
        int left=0;
        int last=arr[arr.length-1];
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<=last){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;

    }
    public int search(int[] nums, int target) {
        int p=find(nums);
        int ans1=binsearch(nums,target,0,p-1);
        int ans2=binsearch(nums,target,p,nums.length-1);
        if(ans1==-1){
            return ans2;
        }
        return ans1;

    }
}
