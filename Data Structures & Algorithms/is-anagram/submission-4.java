class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sArr = new int[256];
        int[] tArr = new int[256];

        for(char c : s.toCharArray()){
            sArr[c]++;
        }
        for(char c : t.toCharArray()){
            tArr[c]++;
        }

        for(int i=0;i<256;i++){
            if(sArr[i]!=tArr[i]){
                return false;
            }
        }
        return true;
    }
}
