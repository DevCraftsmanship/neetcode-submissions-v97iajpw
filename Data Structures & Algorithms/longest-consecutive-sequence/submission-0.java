class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> s = new HashSet<>();
      for(int num : nums){
        s.add(num);
      }   

      int longest = 0;

      for(int num : nums){
        if(!s.contains(num-1)){
            int length = 1;
            while(s.contains(num+length)){
                length=length+1;
            }
            longest = Integer.max(length,longest);
        }
      }

      return longest;
    }
}
