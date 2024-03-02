class Solution {
    // Approach 1 : Brute Force followed by sorting

    public int[] sortedSquares(int[] nums) {
        /*for(int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;*/

    // Approach 2 : Using Two Pointers high and low
        int N = nums.length;
        int[] arr = new int[N];
        int low = 0, high = N - 1;

        for(int i = N - 1; i >= 0; i--){
            if(Math.abs(nums[low]) >= Math.abs(nums[high])){
                arr[i] = nums[low] * nums[low];
                low++;
            }
            else{
                arr[i] = nums[high] * nums[high];
                high--;
            }
        }

        return arr;
    }
}
