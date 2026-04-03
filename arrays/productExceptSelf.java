class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix[]=new int[nums.length];
        int postfix[]=new int [nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=nums[i]*prefix[i-1];
        } 
        postfix[nums.length-1]=nums[nums.length-1];
        for(int j=nums.length-2;j>=0;j--){
            postfix[j]=postfix[j+1]*nums[j];
        }
        int product[]=new int[nums.length];
        for(int k=0;k<nums.length;k++){
            if(k==0){
                product[k]=1*postfix[k+1];
            }
            else if(k==nums.length-1){
                product[k]=1*prefix[nums.length-2];
            }
            else{
            product[k]=prefix[k-1]*postfix[k+1];
            }
        }
        return product;
    }
}
