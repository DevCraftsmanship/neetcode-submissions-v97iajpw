class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()==t.length()){

            int count[] = new int[26];
            for(int i=0;i<s.length();i++){
                count[s.charAt(i)-'a']++;
                count[t.charAt(i)-'a']--;
            }

            return !(Arrays.stream(count).anyMatch(n->n!=0));
       }

       return false;

}}
