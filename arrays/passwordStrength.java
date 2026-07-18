class Solution {
    public int passwordStrength(String pass) {
        int freq_a_z[]=new int[26];
        int freq_A_Z[]=new int[26];
        int freq_num[]=new int[10];
        int ap=0, at=0,hash=0,dollar=0;
        for(int i=0;i<pass.length();i++){
            char ch=pass.charAt(i);
            if(Character.isLowerCase(ch)){
                freq_a_z[ch-'a']++;
            }
            else if(Character.isUpperCase(ch)){
                freq_A_Z[ch-'A']++;
            }
            else if(Character.isDigit(ch)){
                freq_num[ch-'0']++;
            }
            else if(ch=='!'){
                ap++;
            }
            else if(ch=='@'){
                at++;
            }
            else if(ch=='#'){
                hash++;
            }
            else{
                dollar++;
            }
        }
        int score=0;
        for(int i=0;i<freq_a_z.length;i++){
            if(freq_a_z[i]>0){
                score++;
            }
        }
        for(int i=0;i<freq_A_Z.length;i++){
            if(freq_A_Z[i]>0){
                score+=2;
            }
        }
        for(int i=0;i<freq_num.length;i++){
            if(freq_num[i]>0){
                score+=3;
            }
        }
        if(ap>0) score+=5;
        if(at>0) score+=5;
        if(hash>0) score+=5;
        if(dollar>0) score+=5;
        return score;
    }
}
