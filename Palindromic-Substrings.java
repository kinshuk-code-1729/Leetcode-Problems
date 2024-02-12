class Solution {
    int res = 0;
    
    public int countSubstrings(String s) {
        for(int i = 0; i< s.length(); i++){
            count(s, i ,i);
            count(s, i, i + 1);
        }
    
        return res;
    }

    private void count(String s, int start, int end){
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            res++;
            start--;
            end++;
        }
    }
}
