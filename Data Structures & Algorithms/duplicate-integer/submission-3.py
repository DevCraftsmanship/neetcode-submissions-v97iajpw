class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        di = dict()
        for i in range(len(nums)):
            di[nums[i]] = di.get(nums[i],0)+1
        for n in di.values():
            if(n>=2):
                return True
        
        return False
        