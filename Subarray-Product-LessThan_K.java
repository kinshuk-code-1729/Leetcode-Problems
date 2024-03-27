class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // Base case : if "K" is less than or equal 1
        if(k <= 1){
            return 0;
        }

        int count = 0;
        int mul = 1;

        // For sliding window use left & right pointers
        int L = 0, R = 0;

        while(R < nums.length){
            mul *= nums[R];
            while(mul >= k){
                mul /= nums[L];
                L++;
            }
            count += R - L + 1;
            R++;
        }

        return count;       
    }
}
