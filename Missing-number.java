class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int sum = 0;
        int nSum = N * (N + 1) / 2;

        for(int i = 0; i < N; i++){
            sum += nums[i];
        }

        return nSum - sum;
    }
}
