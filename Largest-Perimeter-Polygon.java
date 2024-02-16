class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int N = nums.length;
        long[] ps = new long[N];
        ps[0] = nums[0];

        for(int i=1;i<ps.length;i++){
            ps[i] = nums[i] + ps[i - 1];
        }

        long res = Integer.MIN_VALUE;
        for(int j=2;j<N;j++){
            if(nums[j] < ps[j - 1]){
                res = ps[j];
            }
        }

        return (res == Integer.MIN_VALUE) ? -1 : res;
    }
}
