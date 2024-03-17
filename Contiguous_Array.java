class Solution {
    public int findMaxLength(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                sum += -1;
            }
            else if(nums[i] == 1){
                sum += 1;
            }

            if(map.containsKey(sum)){
                int pos = map.get(sum);
                int len = i - pos;
                if(len > res){
                    res = len;
                }
            }
            else{
                map.put(sum, i);
            }
        }
        return res;
    }
}
