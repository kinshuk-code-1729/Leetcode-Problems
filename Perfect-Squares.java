class Solution {
    Integer[] lruCache;
    public int numSquares(int n) {
        lruCache = new Integer[n + 1];
        return dfs(n);
    }

    private int dfs(int n){
        if(n == 0) return 0;
        if(lruCache[n] != null) return lruCache[n];

        lruCache[n] = Integer.MAX_VALUE;
        for(int i = 1; i*i <= n;i++){
            lruCache[n] = Math.min(lruCache[n],dfs(n - (i*i)) + 1);
        }
        return lruCache[n];
    }
}
