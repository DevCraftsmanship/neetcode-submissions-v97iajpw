class Solution:
    def hasDuplicate(self, nums: list[int]) -> bool:
        seen = set() # Faster than dict()
        for num in nums:
            if num in seen: # O(1) average lookup
                return True # This is your "Early Exit" - the speed winner!
            seen.add(num)
        return False