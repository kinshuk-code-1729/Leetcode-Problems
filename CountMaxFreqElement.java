class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] maxFreq = new int[101];
        for(int i = 0; i < nums.length; i++){
            maxFreq[nums[i]] += 1;
        }
        Arrays.sort(maxFreq);
        int i = 100;
        int res = maxFreq[i];

        while(maxFreq[i] == maxFreq[i - 1]){
            res += maxFreq[i];
            i -= 1;
        }

        return res;
    }
}
