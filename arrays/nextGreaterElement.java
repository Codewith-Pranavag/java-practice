class Solution {
    public int [] nextpermutation(int arr[]){
        //check if pivot ewxist;
        int pivot=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]) {
                pivot=i;
                break;
            }
        }
        if(pivot==-1) return arr;
        int replace=-1;
        for(int i=arr.length-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                replace=i;
                break;
            }
        }
        int swap=arr[pivot];
        arr[pivot]=arr[replace];
        arr[replace]=swap;
        int l=pivot+1;
        int r=arr.length-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=swap;
            r--;
            l++;
        }
        return arr;
    }
    public int nextGreaterElement(int n) {
        char []ch=String.valueOf(n).toCharArray();
        int arr[]=new int[ch.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=ch[i]-'0';
        }
        nextpermutation(arr);
        long ans=0;
        for(int num:arr){
            ans=ans*10+num;
        }
        if(ans<=n || ans>Integer.MAX_VALUE) return -1;
        return (int)ans;
    }
}
