class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int num : nums)
            countMap.put(num,countMap.getOrDefault(num,0)+1);
        
        Queue<Integer> maxHeap = new PriorityQueue<>(
            (a,b)->countMap.get(a)-countMap.get(b)
        );

        for(int key : countMap.keySet()){
            maxHeap.add(key);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }

        int[] ans = new int[k];

        for(int i=0;i<k;i++){
            ans[i] = maxHeap.poll();
        }

        return ans;
    }
}
