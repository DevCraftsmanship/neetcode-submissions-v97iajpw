class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int [] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                int ans2 = map.get(target-nums[i]);
                int ans1=i;
                ans[0] = ans2;
                ans[1] = ans1;
                // Arrays.sort(ans);
                return ans;
            }
            
            map.put(nums[i],i);
        }

        return ans;
    }
}
