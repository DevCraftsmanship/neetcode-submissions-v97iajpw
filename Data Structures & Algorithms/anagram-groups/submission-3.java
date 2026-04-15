class Solution {
    static List<Integer> getFreq(String s){
       List<Integer> l = new ArrayList<>();
       int[] arr = new int[26];
        for(char c : s.toCharArray()){
            arr[c-'a']++;
        }

        for(int num : arr){
            l.add(num);
        }
        return l;
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
       return Arrays.stream(strs).collect(Collectors.groupingBy(s->getFreq(s))).values().stream().collect(Collectors.toList());
    }
}
