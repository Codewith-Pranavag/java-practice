class Solution {
    public int countTestedDevices(int[] arr) {
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) continue;
            c++;
            for(int j=i+1;j<n;j++){
                arr[j]=Math.max(0,arr[j]-1);
            }
        }
        return c;
        
    }
}
