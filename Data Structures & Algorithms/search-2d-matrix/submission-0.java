class Solution {
    public static int search(int[] nums, int target) {
        int beg = 0, end = nums.length - 1;
        
        while (beg <= end) {  // Use <= to check the last element
            int mid = beg + (end - beg) / 2; // Prevents overflow
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) { // Compare with nums[mid], not mid
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;  // Target not found
    }
   public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int res = search(matrix[i], target);  // Corrected row-wise search
            if (res != -1) {
                return true;  // Found the target
            }
        }
        return false;  // Target not found
    }
    
}
