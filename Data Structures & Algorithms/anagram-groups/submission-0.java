class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> result = new HashMap<>();
        for(String str : strs){
            String freqStr = getFreqString(str);
            if(result.containsKey(freqStr)){
                result.get(freqStr).add(str);
            }else{
                List<String> k = new ArrayList<>();
                k.add(str);
                result.put(freqStr,k);
            }
        }
        return new ArrayList<>(result.values());
    }
public static String getFreqString(String str){
    StringBuilder sb = new StringBuilder("");
    int count[] = new int[26];

    for(int i=0;i<str.length();i++){
        count[str.charAt(i) - 'a']++;
    }
    char c = 'a';
    for(int i : count){
        sb.append(c);
        sb.append(i);
        c++;
    }

    return sb.toString();
}

}
