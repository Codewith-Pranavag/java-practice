class Solution {
    int i=0;
    public int numberOfSteps(int num) {
        if(num==0){
            return i;
        }
        if(num%2==0){
            i++;
         return numberOfSteps(num/2);
        }
        else{
            i++;
            return numberOfSteps(num-1);
        }

        
    }
}
