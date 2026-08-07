class Solution {
    public int maxArea(int arr[]){
        int maxarea=0;
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];
        Stack <Integer> s=new Stack<>();
        //greater right
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
       s.clear();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<arr.length;i++){
            int h=arr[i];
            int w=nsr[i]-nsl[i]-1;
            int temp=h*w;
            maxarea=Math.max(maxarea,temp);
        }
        return maxarea;
    }
    public int largestRectangleArea(int[] heights) {
        return maxArea(heights);    
    }
}
