class Solution {
    public int maxProfit(int[] prices) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (!minHeap.isEmpty()) {
                int minPrice = minHeap.peek();
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }

            minHeap.add(prices[i]); // add AFTER using
        }

        return maxProfit;
    }
}