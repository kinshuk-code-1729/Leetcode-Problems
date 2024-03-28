class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int left = 0, right = 0; right < nums.length; right++) {
            map.merge(nums[right], 1, Integer::sum);
            
            while (map.get(nums[right]) == k + 1){
                map.merge(nums[left++], -1, Integer::sum);
            }
            
            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}
