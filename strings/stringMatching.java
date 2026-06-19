class Solution {
    public boolean isadded(String str,List<String> res){
        for(int i=0;i<res.size();i++){
            if(res.get(i).equals(str)) return false;
        }
        return true;
    }
    public List<String> stringMatching(String[] words) {
        List<String> mylist=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String parentString=words[i];
            for(int j=0;j<words.length;j++){
                String substr=words[j];
                 if(substr.equals(parentString)) continue;
                if(parentString.contains(substr)){
                    if(isadded(substr,mylist)){
                        mylist.add(substr);
                    }
                }
            }
        }
        return mylist;

    }
}
