class Solution {
    Map<Integer,List<Integer>> map = new HashMap<>();
    List<Integer> checkDiv(int[] nums, int i){
        if(map.containsKey(i)){
            return map.get(i);
        }

        List<Integer> Muls = new ArrayList<>();
        
        int div = i == 0 ? 1 : nums[i - 1];
        for(int k = i; k < nums.length; k++){
            if(nums[k] % div == 0){
                List<Integer> arr = new ArrayList<>(checkDiv(nums, k + 1));
                arr.add(nums[k]);
                if(arr.size() > Muls.size()){
                    Muls = arr;
                }
            }
        }

        map.put(i, Muls);
        return Muls;
    }
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        return checkDiv(nums, 0);    
    }
}
