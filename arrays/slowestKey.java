class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max=releaseTimes[0];
        char ch=keysPressed.charAt(0);
        for(int i=1;i<releaseTimes.length;i++){
            int temp_time=releaseTimes[i]-releaseTimes[i-1];
            char temp_char=keysPressed.charAt(i);
            if(temp_time==max){
                if(keysPressed.charAt(i) >ch){
                    ch=keysPressed.charAt(i);
                }
            }
            else{
                if(temp_time>max){
                    max=temp_time;
                    ch=temp_char;
                }
            }
        }
        return ch;
        
    }
}
