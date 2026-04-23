class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left=0
        right=1
        maxp=0
        while(right<len(prices)):
            if prices[right]-prices[left]>0:
                profit = prices[right]-prices[left]
                maxp=max(maxp,profit)
            else:
                left=right
            right+=1
        return maxp

        