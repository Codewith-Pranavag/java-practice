class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        if(a+b<=c) return "none";
        if(b+c<=a) return "none";
        if(c+a<=b) return "none";
        if(a==b && b==c) return "equilateral";
        if(a==b || b==c || c==a) return "isosceles";
        return "scalene";
        
    }
}
