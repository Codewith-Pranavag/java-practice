class Solution {
    public boolean canConstruct(String ran, String mag) {
        int arr[]=new int[26];
        int arr2[]=new int[26];
        //arr--mag
        for(int i=0;i<mag.length();i++){
            char ch=mag.charAt(i);
            Character.toLowerCase(ch);
            arr[ch-97]++;
        }
        //arr--ran
        for(int j=0;j<ran.length();j++){
            char ch1=ran.charAt(j);
            Character.toLowerCase(ch1);
            arr2[ch1-97]++;
        }
        for(int q=0;q<ran.length();q++){
            char ch2=ran.charAt(q);
            if(arr[ch2-97]<arr2[ch2-97]){
                return false;
            }
        }

        return true;
    }
}
