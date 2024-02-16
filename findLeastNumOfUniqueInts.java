class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> occ = new HashMap<>();
        for(int x : arr){
            occ.merge(x, 1, Integer::sum);
        }

        PriorityQueue<Integer> q = new PriorityQueue<>(occ.values());
        while(k > 0){
            k -= q.poll();
        }
        return q.size() + (k < 0 ? 1 : 0);
    }
}
