class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map =new HashMap<>();
        // List<Integer> ans = new ArrayList<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

       List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
       list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int [] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=list.get(i).getKey();
        }
        return ans;
    }
}
