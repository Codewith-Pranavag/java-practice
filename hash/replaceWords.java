class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String words[]=sentence.split(" ");
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<dictionary.size();i++){
            for(int j=0;j<words.length;j++){
                if(words[j].startsWith(dictionary.get(i))) {
                    if(!map.containsKey(words[j]) || dictionary.get(i).length()<map.get(words[j]).length()){
                        map.put(words[j],dictionary.get(i));
                    }
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                sb.append(map.get(words[i]));
            }
            else{
                sb.append(words[i]);
            }
            if(i!=words.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
