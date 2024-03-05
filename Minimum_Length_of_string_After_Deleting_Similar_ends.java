class Solution {
    public int minimumLength(String s) {
        int N = s.length();
        int pref = 0;
        int suff = N - 1;
        while(pref < suff && s.charAt(pref) == s.charAt(suff)){
            char k = s.charAt(suff);
            // 1st step : delete prefix
            while(pref <= suff && s.charAt(pref) == k){
                pref++;
            }
            // 2nd step : delete suffix
            while(pref <= suff && s.charAt(suff) == k){
                suff--;
            }
        }

        return suff - pref + 1;
    }
}
