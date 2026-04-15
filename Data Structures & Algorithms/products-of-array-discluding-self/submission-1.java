class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        // Initialize the whole array with 1s so we can multiply into them
        java.util.Arrays.fill(ans, 1);

        int prefix = 1;
        int suffix = 1;

        for (int i = 0; i < n; i++) {
            // Left pointer (i) updates the answer from the start
            ans[i] *= prefix;
            prefix *= nums[i];

            // Right pointer (j) updates the answer from the end
            int j = n - 1 - i;
            ans[j] *= suffix;
            suffix *= nums[j];
        }

        return ans;
    }
}