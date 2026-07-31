import java.util.*;
public class code{
    public static boolean isvalid(String str){
        Stack <Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //opening/operator/operand
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
            if(ch!=')'){
                s.push(ch);
            }
        }
        return false;
    }
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        String str="((a+b))";
        String str2="(a+b)";
        boolean result=isvalid(str2);
        System.out.print(result);
    }
}
