public static String reverseString (String str){
Stack<Character> s=new Stack<>();
int indx=0;
while(indx<s.length()){
  s.push(str.charAt(indx));
  indx++;
}
StringBuilder sb=new StringBuilder("");
while(!s.isEmpty()){
  sb.append(s.peek);
  s.pop();
}
return sb.toString();
}
