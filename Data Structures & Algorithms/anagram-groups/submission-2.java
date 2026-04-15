class Solution {
    // Generates a fixed-size list of 26 integers representing char counts
    static List<Integer> getFreq(String s) {
        // Pre-fill with 26 zeros so we can use .set(index, value)
        List<Integer> l = new ArrayList<>(Collections.nCopies(26, 0));
        
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            l.set(index, l.get(index) + 1);
        }
        return l;
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        return Arrays.stream(strs)
                     .collect(Collectors.groupingBy(Solution::getFreq))
                     .values()
                     .stream()
                     .collect(Collectors.toList());
    }
}
