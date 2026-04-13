class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int a : nums){
            if(!m.containsKey(a)){
                m.put(a,1);
            }else{
                m.put(a,m.get(a)+1);
            }

            
        }

        for(int j : m.values()){
            if(j>1)
            return true;
        }
        return false;
    }
}
