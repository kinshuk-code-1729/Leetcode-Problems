class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left = 0;
        int right = tokens.length - 1;
        int score = 0;
        int res = 0;

        while(left <= right){
            if(tokens[left] <= power){
                power -= tokens[left];
                left++;
                score++;
                res = Math.max(res, score);
            }
            else if(score > 0){
                power += tokens[right];
                right--;
                score--;
            }
            else{
                break;
            }
        }
        return res;
    }
}
