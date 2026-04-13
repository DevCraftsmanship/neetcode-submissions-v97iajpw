class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)){
                int val =map.get(num)+1;
                map.put(num,val);
            }else{
                map.put(num,1);
            }
        }

        List<Integer>[] bucket = new List[nums.length+1];

        for(int key : map.keySet()){
            int value = map.get(key);
            if(bucket[value]==null){
                bucket[value] = new ArrayList<>();
            }
                bucket[value].add(key);
        }

    int index = 0;
    int [] res = new int[k];

        for(int pos = bucket.length-1;pos>=0 && index < k;pos--){
            if(bucket[pos]!=null){
                for(int integer : bucket[pos]){
                    res[index++]=integer;
                }
            }
        }
        
        
    return res;
    }
}
