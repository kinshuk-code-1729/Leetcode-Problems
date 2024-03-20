class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(int i = 0; i < tasks.length; i++){
            count[tasks[i] - 'A']++;
        }
        Arrays.sort(count);
        int MAX = count[25];
        int IDLE = (MAX - 1) * n;
        for(int i = 24; i >= 0; i--){
            IDLE -= Math.min(MAX - 1, count[i]);
        }
        IDLE = Math.max(0, IDLE);
        return tasks.length + IDLE;
    }
}
