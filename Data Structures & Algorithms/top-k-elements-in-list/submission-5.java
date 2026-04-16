class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int num : nums)
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		

		Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> countMap.get(b).compareTo(countMap.get(a)));

		for (int key : countMap.keySet()) {
			maxHeap.add(key);
		}
		

		int[] ans = new int[k];

		for (int i = 0; i < k; i++) {
			int ansNum = maxHeap.peek();
			ans[i] = ansNum;
			maxHeap.poll();
		}

		return ans;
	
    }
}
