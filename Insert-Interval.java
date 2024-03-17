class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        boolean inserted = false;
        for(int i = 0; i < intervals.length; i++){
            // end of interval < start of new
            if(intervals[i][1] < newInterval[0]){
                ans.add(intervals[i]);
            }

            // start of interval > end of new
            else if(intervals[i][0] > newInterval[1]){
                if(inserted == false){
                    ans.add(newInterval);
                    inserted = true;
                }
                ans.add(intervals[i]);
            }

            else{
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        if(inserted == false){
            ans.add(newInterval);
        }
        return ans.toArray(new int[0][]);
    }
}
