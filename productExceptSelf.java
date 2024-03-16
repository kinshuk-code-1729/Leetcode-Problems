class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] pref = new int[N];
        int[] suff = new int[N];
        int[] res = new int[N];

        pref[0] = 1;
        for(int i = 1; i < N; i++){
            pref[i] = pref[i - 1] * nums[i - 1];
        }

        suff[N - 1] = 1;
        for(int j = N - 2; j >= 0; j--){
            suff[j] = suff[j + 1] * nums[j + 1];
        }

        for(int k = 0; k < N; k++){
            res[k] = pref[k] * suff[k];
        }

        return res;
    }
}