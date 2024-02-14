class Solution {
    public int[] rearrangeArray(int[] nums) {
        int N = nums.length;
        int[] res = new int[N];
        List<Integer> plus = new ArrayList<>();
        List<Integer> minus = new ArrayList<>();

        for(int k : nums){
            if(k > 0){
                plus.add(k);
            }
            else{
                minus.add(k);
            }
        }

        for(int j = 0; j < plus.size(); j++){
            res[j * 2] = plus.get(j);
            res[j * 2 + 1] = minus.get(j);
        }

        return res;
    }
}
