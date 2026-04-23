class Solution {
    public int maxSubArray(int[] nums) {
        int l=0,r=1;
        int maxSum = nums[0];
        int currSum = nums[0];
        while(r<nums.length){
            if(currSum<0){
                currSum=nums[r];
            }else{
                currSum+=nums[r];
            }

            maxSum=Math.max(maxSum,currSum);
            r++;
        }
        return maxSum;
    }
}
