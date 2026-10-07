class Solution {
    public int clumsy(int n) {
        Stack<Integer> s=new Stack<>();
        s.push(n);
        int op=0;
        for(int i=n-1;i>0;i--){
            if(op==0){
                s.push(s.pop()*i);
            }
            else if(op==1){
                s.push(s.pop()/i);
            }
            else if(op==2){
                s.push(i);
            }
            else if(op==3){
                s.push(-i);
            }
            op=(op+1)%4;
        }
        int c=0;
        while(!s.isEmpty()){
            c+=s.pop();
        }
        return c;
    }
}
