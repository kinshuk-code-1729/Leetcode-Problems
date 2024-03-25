class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            int j = Math.abs(nums[i]) - 1;
            if(nums[j] < 0){
                ans.add(Math.abs(nums[i]));
            }
            nums[j] = -nums[j];
        }

        return ans;
    }
}
