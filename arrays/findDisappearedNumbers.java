class Solution {
    public boolean ischeck(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return true;
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<=n;i++){
            if(!ischeck(nums,i)) list.add(i);
        }
        return list;


        
    }
