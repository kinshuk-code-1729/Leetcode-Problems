class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int fakeNumber = n + 1;
        
        // Step 1.
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = fakeNumber;
            }
        }
        
        // Step 2.
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]); // point 1
            if (num == fakeNumber) { // point 2
                continue;
            }
            num--; // point 3
            if (nums[num] > 0) {
                nums[num] *= -1;
            }
        }
        
        // Step 3.
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }
        
        // otherwise return n+1
        return n + 1;
    }
}
